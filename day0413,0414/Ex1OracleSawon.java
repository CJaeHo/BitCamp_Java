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
			System.out.println("����Ŭ ����̹� ����!");			
		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ ����̹� ����!:"+e.getMessage());
			// ������ ����̹� ������ ��ã�ų� ��ҹ��� ��Ÿ�� �ְų�..
		} // driver ojdbc14.jar���� ����̹����� class ������ ���ִ� ��
	}
	public int getMenu() {
		System.out.println();
		System.out.println("** �޴� ���� **");
		System.out.println("1.����߰�	2.��ü������	3.����˻�	4.�μ����м�	5.����");
		int n=Integer.parseInt(sc.nextLine());
		return n;
	}
	// db ������ �����ϴ� �޼��带 �̸� ����������
	// ���� ���ϰ���
	public Connection getConnection() {		// �װ� �̰ž�
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url, "bit901", "a1234");
			// Driver�� �����ϴ� �Ŷ�. ������ ������ url �̸� ���
			System.out.println("db ���� ����");
		} catch (SQLException e) {
			System.out.println("db ���� ����:"+e.getMessage());
		}
			
		return conn;
	}
	public void sawonInsert() {	// ����߰� Ŭ����
		// db �����ؾ���
		Connection conn=this.getConnection();
		
		Statement stmt=null;
		// statement.sql�� import�������. beans �ƴϾ�!!
		
		System.out.println("�����");
		String name=sc.nextLine();
		System.out.println("�μ���(ȫ����,�λ��,������):");
		String buseo=sc.nextLine();
		System.out.println("�⺻��:");
		int gibon=Integer.parseInt(sc.nextLine());
		System.out.println("����:");
		int sudang=Integer.parseInt(sc.nextLine());
										// nextval �ڵ����� ����
		String sql="insert into sawon values (seq_bit.nextval,'"
				+name+"','"+buseo+"',"+gibon+","+sudang+",sysdate)";
		System.out.println(sql);	
		// db�� ���� �� ���� ���� Ȯ��
		// ���ڿ��� '' �Ǿ��ִ��� ���� �ߵǾ��ִ��� ��Ÿ������
		
		try {
			stmt=conn.createStatement();
			// sql ���� ����
			stmt.execute(sql);	// ���⼭ Exception�� �߻��ϸ� ��¾ȴ�
			System.out.println("DB�� ����Ÿ�� �߰��Ǿ����!");
		} catch (SQLException e) {
			System.out.println("insert ����:"+e.getMessage());
		} finally {
			try {
				if(stmt!=null) stmt.close();// ���߿� ������ ����
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				
			}
		}
	}
	public void sawonAllWrite() {	// ��� Ŭ����
		// db �����ؾ���
		Connection conn=this.getConnection();
		
		Statement stmt=null;
		// statement.sql�� import�������. beans �ƴϾ�!!
		ResultSet rs=null;	// ������ �߸� �켱 import �غ�
		String sql="select * from sawon order by name"; // �̸�������
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);	// select�� �ً��� ������ �̰ɷ�!!
			
			// ����
			System.out.println("��ȣ\t�����\t�μ���\t�⺻��\t����\t�ѱ޿�\t�����");
			while(rs.next()) {	// �������� ���پ� �дٰ� ������ false
				// ����ȣ�� ��������
//				int num=rs.getInt(1);
//				String name=rs.getString(2);
//				String buseo=rs.getString(3);
//				int gibon=rs.getInt(4);
//				int sudang=rs.getInt(5);
//				int total=gibon+sudang;
//				Timestamp ts=rs.getTimestamp(6);
				// import�� java.sql��
				
				// �÷������� ��������
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String buseo=rs.getString("buseo");
				int gibon=rs.getInt("gibon");
				int sudang=rs.getInt("sudang");
				int total=gibon+sudang;
				Timestamp ts=rs.getTimestamp("writeday");
				// ��¥�� ���ڿ��� ��ȯ
				// mysql���� sysdate�� �����ͼ� java���� 
				// ��ȯ�ϴ°� simpledateformat �̰�
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");//24�ð�
//				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm");//����,�� 12�ð�			
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
		
		System.out.println("�˻��� �̸� or ���� �Է�");
		String searchName=sc.nextLine();
		String sql="select num,name,buseo,gibon,sudang,gibon+sudang total, "
				+ "to_char(writeday,'yyyy-MM-dd hh:mm') writeday from sawon "
				+ "where name like '%"+searchName+"%'";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		// ���� ����
		conn=this.getConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("\t**** "+searchName+"(��)�� �˻� ****");
			System.out.println();
			System.out.println("��ȣ\t�̸�\t�μ�\t�⺻��\t����\t�ѱ޿�\t�����");
			while(rs.next()) {
				System.out.println(rs.getString("num")+"\t"+rs.getString("name")
							+"\t"+rs.getString("buseo")+"\t"+rs.getInt("gibon")
							+"\t"+rs.getInt("sudang")+"\t"+rs.getInt("total")
							+"\t"+rs.getString("writeday"));
			}
			int n=stmt.executeUpdate(sql);
			if(n==0) {
				System.out.println(searchName+"��(��) ������ �̸��� �����ϴ�");
			}else {
				System.out.println(searchName+"��(��) �����ϴ� �̸��� "+n+"�� �Դϴ�");
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
		
		// db �����ϱ�
		conn=this.getConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("\t**** �μ��� ��ձ޿� �м�ǥ *****");
			System.out.println();
			System.out.println("�μ���\t��ձ޿�");
			while(rs.next()) {
				System.out.println(rs.getString("buseo")+"\t"+rs.getInt("pay")+"����");
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
				System.out.println("���α׷� ����!");
				System.exit(0);
			}
		}
	}

}
