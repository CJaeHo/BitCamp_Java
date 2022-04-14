package day0413;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex2MysqlPerson {
	static final String DRIVER="com.mysql.jdbc.Driver";	// 5버전
//	static final String DRIVER="com.mysql.cj.jdbc.Driver";	// 8버전
	static final String URL="jdbc:mysql://localhost:3306/bitcamp";//5버전
//	static final String URL="jdbc:mysql://localhost:3306/bitcamp?serverTimezone=Asia/Seoul";//8버전
	
	Scanner sc=new Scanner(System.in);
	
	public Ex2MysqlPerson() {
		try {
			Class.forName(DRIVER);
//			System.out.println("mysql 드라이버 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql 드라이버 실패:"+e.getMessage());
		}
	}
	
	public Connection getConnection() {	//sql 연동되는 Connection
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL,"root","a1234");
//			System.out.println("mysql 접근 성공");
		} catch (SQLException e) {
			System.out.println("mysql 접근 실패");
			e.printStackTrace();
		}
		return conn;
	}
	
	public int getMenu() {
		System.out.println(" 메 뉴 선 택" );
		System.out.println("1.추가	2.전체출력	3.삭제	4.분석	5.종료");
		int n=Integer.parseInt(sc.nextLine());
		return n;
	}
	
	public void personInsert() {
		Connection conn=null;
		PreparedStatement pstmt=null;	// import -> java.sql로 mysql 아니야!!!
		String sql="";
		//////////////////// 필요한 데이타 입력
		System.out.println("이름 입력");
		String name=sc.nextLine();
		System.out.println("혈액형 입력");
		String blood=sc.nextLine();
		System.out.println("나이 입력");
		int age=Integer.parseInt(sc.nextLine());
		//////////////////////
		
		////////////////////////// db연결
		conn=this.getConnection();
		sql="insert into person (name,blood,age,writeday) values (?,?,?,now())";
		//												?는 나중에 값을 넣겠다..
		
		try {
			// sql 검사
			pstmt=conn.prepareStatement(sql);	// sql문이 여기 들어간다는거..이해안감ㅎ..ㅎㅎㅎ...
			// ? 갯수만큼 반드시 바인딩해야함. ?는 1번부터 시작
			pstmt.setString(1, name);
			pstmt.setString(2, blood);
			pstmt.setInt(3, age);
			// 실행
			pstmt.execute();
			System.out.println("추가됨여!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();				
			} catch (SQLException e) {
				
			}
		}
		//////////////////////////
		
	}
	public void personAllWrite() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;		// statement쓰면 Resultset은 자동임
		String sql="select * from person order by name";	// 이름순으로
		
		// db연결
		conn=this.getConnection();	// db 연결했고
		try {
			pstmt=conn.prepareStatement(sql);	// prepareStatement 얘는 여기서 sql 받아
			rs=pstmt.executeQuery();		// select가 있기 때문에 executeQuery()는 무조건 해야함
											// 바인딩 없으니 바로
			System.out.println("\t** Person DB 목록 **");
			System.out.println();
			System.out.println("번호\t이름\t혈액형\t나이\t작성일");
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
			
			while(rs.next()) {
				String num=rs.getString("num");
				String name=rs.getString("name");
				String blood=rs.getString("blood").toUpperCase();	// touppercase()는 대문자로 변환
				int age=rs.getInt("age");
				Timestamp ts=rs.getTimestamp("writeday");
				
				
				System.out.println(num+"\t"+name+"\t"+blood+"\t"+age+"\t"+sdf.format(ts));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				
			}
		}
	}
	public void personDelete() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="delete from person where name=?";
		System.out.println("지울 이름 입력");
		String name=sc.nextLine();
		
		//db연결
		conn=this.getConnection();
		
		try {
			pstmt=conn.prepareStatement(sql);
			// 바운딩
			pstmt.setString(1, name);
			pstmt.execute();
			System.out.println("삭제되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 이름을 입력 후 해당 데이타 삭제하기
		// 삭제 후 삭제되었습니다 메세지 출력
	}
	public void personBloodGroup() {
		Connection conn=null;			
		PreparedStatement pstmt=null;	
		ResultSet rs=null;		
		String sql="select blood, count(*), avg(age) from person group by blood";	
		
		
		
		conn=this.getConnection();		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			System.out.println("\t******* 혈액형 목록 ********");
			System.out.println();
			System.out.println("혈액형\t인원수\t평균나이");
			
			
			while(rs.next()) {
				String blood=rs.getString("blood").toUpperCase();	// touppercase()는 대문자로 변환;
				int count=rs.getInt("count(*)");
				int age=rs.getInt("avg(age)");
				
				System.out.println(blood+"형\t"+count+"명\t"+age+"세");
		}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				
			}
		}
		
		// 혈액형 별 인원수와 평균 나이 출력(group by)
		/*
		 * 혈액형	인원수	평균나이
		 * A형		2		32(정수로)
		 * B형		3		29
		 *	.... 이런식으로 나오게끔
		 */
	}
	public static void main(String[] args) {
		Ex2MysqlPerson ex=new Ex2MysqlPerson();
		while(true) {
			int n=ex.getMenu();
			switch(n) {
			case 1:
				ex.personInsert();
				break;
			case 2:
				ex.personAllWrite();
				break;
			case 3:
				ex.personDelete();
				break;
			case 4:
				ex.personBloodGroup();
				break;
			default:
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}

}
