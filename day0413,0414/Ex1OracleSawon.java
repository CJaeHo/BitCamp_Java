package day0413;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex1OracleSawon {
	
	static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String url="jdbc:oracle:thin:@localhost:1521:xe";
	
	Scanner sc=new Scanner(System.in);
	
	public Ex1OracleSawon() {
		try {
			Class.forName(DRIVER);
			System.out.println("오라클 드라이버 성공!");			
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 실패!:"+e.getMessage());
			// 오류는 드라이버 파일을 못찾거나 대소문자 오타가 있거나..
		} // driver ojdbc14.jar같은 드라이버들은 class 파일이 모여있는 거
	}
	public int getMenu() {
		System.out.println();
		System.out.println("** 메뉴 선택 **");
		System.out.println("1.사원추가	2.전체사원출력	3.사원검색	4.부서별분석	5.종료");
		int n=Integer.parseInt(sc.nextLine());
		return n;
	}
	// db 서버에 연결하는 메서드를 미리 만들어놓으면
	// 쓰기 편하겠지
	public Connection getConnection() {		// 그게 이거야
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url, "bit901", "a1234");
			// Driver랑 연결하는 거랑. 연결할 계정의 url 이름 비번
			System.out.println("db 연결 성공");
		} catch (SQLException e) {
			System.out.println("db 연결 실패:"+e.getMessage());
		}
			
		return conn;
	}
	public void sawonInsert() {	// 사원추가 클래스
		// db 연결해야함
		Connection conn=this.getConnection();
		
		Statement stmt=null;
		// statement.sql로 import해줘야함. beans 아니야!!
		
		System.out.println("사원명");
		String name=sc.nextLine();
		System.out.println("부서명(홍보부,인사부,교육부):");
		String buseo=sc.nextLine();
		System.out.println("기본급:");
		int gibon=Integer.parseInt(sc.nextLine());
		System.out.println("수당:");
		int sudang=Integer.parseInt(sc.nextLine());
										// nextval 자동으로 들어가게
		String sql="insert into sawon values (seq_bit.nextval,'"
				+name+"','"+buseo+"',"+gibon+","+sudang+",sysdate)";
		System.out.println(sql);	
		// db로 넣을 떄 오류 없게 확인
		// 문자열에 '' 되어있는지 띄어쓰기 잘되어있는지 오타없는지
		
		try {
			stmt=conn.createStatement();
			// sql 문을 실행
			stmt.execute(sql);	// 여기서 Exception이 발생하면 출력안댐
			System.out.println("DB에 데이타가 추가되었어요!");
		} catch (SQLException e) {
			System.out.println("insert 오류:"+e.getMessage());
		} finally {
			try {
				if(stmt!=null) stmt.close();// 나중에 열린걸 먼저
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				
			}
		}
	}
	public void sawonAllWrite() {	// 출력 클래스
		// db 연결해야함
		Connection conn=this.getConnection();
		
		Statement stmt=null;
		// statement.sql로 import해줘야함. beans 아니야!!
		ResultSet rs=null;	// 빨간줄 뜨면 우선 import 해봐
		String sql="select * from sawon order by name"; // 이름순으로
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);	// select로 줄떄는 무조건 이걸로!!
			
			// 제목
			System.out.println("번호\t사원명\t부서명\t기본급\t수당\t총급여\t등록일");
			while(rs.next()) {	// 맨위부터 한줄씩 읽다가 없으면 false
				// 열번호로 가져오기
//				int num=rs.getInt(1);
//				String name=rs.getString(2);
//				String buseo=rs.getString(3);
//				int gibon=rs.getInt(4);
//				int sudang=rs.getInt(5);
//				int total=gibon+sudang;
//				Timestamp ts=rs.getTimestamp(6);
				// import는 java.sql로
				
				// 컬럼명으로 가져오기
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String buseo=rs.getString("buseo");
				int gibon=rs.getInt("gibon");
				int sudang=rs.getInt("sudang");
				int total=gibon+sudang;
				Timestamp ts=rs.getTimestamp("writeday");
				// 날짜를 문자열로 변환
				// mysql에서 sysdate를 가져와서 java에서 
				// 변환하는게 simpledateformat 이거
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");//24시간
//				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm");//오전,후 12시간			
				System.out.println(num+"\t"+name+"\t"+buseo+"\t"+
				gibon+"\t"+sudang+"\t"+total+"\t"+sdf.format(ts));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				
			}
		}
	}
	
	public void sawonSearch() {
		
		System.out.println("검색할 이름 or 성을 입력");
		String searchName=sc.nextLine();
		String sql="select num,name,buseo,gibon,sudang,gibon+sudang total, "
				+ "to_char(writeday,'yyyy-MM-dd hh:mm') writeday from sawon "
				+ "where name like '%"+searchName+"%'";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		// 이제 연결
		conn=this.getConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("\t**** "+searchName+"(으)로 검색 ****");
			System.out.println();
			System.out.println("번호\t이름\t부서\t기본급\t수당\t총급여\t등록일");
			while(rs.next()) {
				System.out.println(rs.getString("num")+"\t"+rs.getString("name")
							+"\t"+rs.getString("buseo")+"\t"+rs.getInt("gibon")
							+"\t"+rs.getInt("sudang")+"\t"+rs.getInt("total")
							+"\t"+rs.getString("writeday"));
			}
			int n=stmt.executeUpdate(sql);
			if(n==0) {
				System.out.println(searchName+"을(를) 포함한 이름은 없습니다");
			}else {
				System.out.println(searchName+"을(를) 포함하는 이름은 "+n+"개 입니다");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}catch(SQLException e){
				
			}
		}
		
	}
	
	public void sawonBuseoGroup() {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql="select buseo,round(avg(gibon+sudang),0) pay from sawon group by buseo";
		
		// db 연결하기
		conn=this.getConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("\t**** 부서별 평균급여 분석표 *****");
			System.out.println();
			System.out.println("부서명\t평균급여");
			while(rs.next()) {
				System.out.println(rs.getString("buseo")+"\t"+rs.getInt("pay")+"만원");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}catch(SQLException e) {
				
			}
		}
		

	}
	
	public static void main(String[] args) {

		Ex1OracleSawon ex= new Ex1OracleSawon();
		while(true) {
			int n=ex.getMenu();
			switch(n) {
			case 1:
				ex.sawonInsert();
				break;
			case 2:
				ex.sawonAllWrite();
				break;
			case 3:
				ex.sawonSearch();
				break;
			case 4:
				ex.sawonBuseoGroup();
				break;
			default:
				System.out.println("프로그램 종료!");
				System.exit(0);
			}
		}
	}

}
