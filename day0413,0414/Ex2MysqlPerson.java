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
	static final String DRIVER="com.mysql.jdbc.Driver";	// 5����
//	static final String DRIVER="com.mysql.cj.jdbc.Driver";	// 8����
	static final String URL="jdbc:mysql://localhost:3306/bitcamp";//5����
//	static final String URL="jdbc:mysql://localhost:3306/bitcamp?serverTimezone=Asia/Seoul";//8����
	
	Scanner sc=new Scanner(System.in);
	
	public Ex2MysqlPerson() {
		try {
			Class.forName(DRIVER);
//			System.out.println("mysql ����̹� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql ����̹� ����:"+e.getMessage());
		}
	}
	
	public Connection getConnection() {	//sql �����Ǵ� Connection
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL,"root","1234");
//			System.out.println("mysql ���� ����");
		} catch (SQLException e) {
			System.out.println("mysql ���� ����");
			e.printStackTrace();
		}
		return conn;
	}
	
	public int getMenu() {
		System.out.println(" �� �� �� ��" );
		System.out.println("1.�߰�	2.��ü���	3.����	4.�м�	5.����	6.����");
		int n=Integer.parseInt(sc.nextLine());
		return n;
	}
	
	public void personInsert() {
		Connection conn=null;
		PreparedStatement pstmt=null;	// import -> java.sql�� mysql �ƴϾ�!!!
		String sql="";
		//////////////////// �ʿ��� ����Ÿ �Է�
		System.out.println("�̸� �Է�");
		String name=sc.nextLine();
		System.out.println("������ �Է�");
		String blood=sc.nextLine();
		System.out.println("���� �Է�");
		int age=Integer.parseInt(sc.nextLine());
		//////////////////////
		
		////////////////////////// db����
		conn=this.getConnection();
		sql="insert into person (name,blood,age,writeday) values (?,?,?,now())";
		//												?�� ���߿� ���� �ְڴ�..
		
		try {
			// sql �˻�
			pstmt=conn.prepareStatement(sql);	// sql���� ���� ���ٴ°�..���ؾȰ���..������...
			// ? ������ŭ �ݵ�� ���ε��ؾ���. ?�� 1������ ����
			pstmt.setString(1, name);
			pstmt.setString(2, blood);
			pstmt.setInt(3, age);
			// ����
			pstmt.execute();
			System.out.println("�߰��ʿ�!");
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
		ResultSet rs=null;		// statement���� Resultset�� �ڵ���
		String sql="select * from person order by name";	// �̸�������
		
		// db����
		conn=this.getConnection();	// db �����߰�
		try {
			pstmt=conn.prepareStatement(sql);	// prepareStatement ��� ���⼭ sql �޾�
			rs=pstmt.executeQuery();		// select�� �ֱ� ������ executeQuery()�� ������ �ؾ���
											// ���ε� ������ �ٷ�
			System.out.println("\t** Person DB ��� **");
			System.out.println();
			System.out.println("��ȣ\t�̸�\t������\t����\t�ۼ���");
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
			
			while(rs.next()) {
				String num=rs.getString("num");
				String name=rs.getString("name");
				String blood=rs.getString("blood").toUpperCase();	// touppercase()�� �빮�ڷ� ��ȯ
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
		// �̸��� �Է� �� �ش� ����Ÿ �����ϱ�
		// ���� �� �����Ǿ����ϴ� �޼��� ���
		// �̸��� ������ "xxx���� ��ܿ� �����ϴ�"
		
		// ������� �ϽŰ�
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="delete from person where name=?";
		System.out.println("������ �̸� �Է�");
		String name=sc.nextLine();
		// ���� db�� �������
		conn=this.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			// ? ������ŭ ���ε�
			pstmt.setString(1, name);
			// ������ ���� ��ȯ.. ���������� ���� �� ���ݾ�..
			int n=pstmt.executeUpdate();
			if(n==0) {
				System.out.println(name+"���� ��ܿ� �����ϴ�");
			}else {
				System.out.println("�� "+n+"���� "+name+"���� �����Ǿ����ϴ�");				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();				
			} catch (SQLException e) {
				
			}
		}
		
		
		
		
		// �����Ѱ�
//		Connection conn=null;
//		PreparedStatement pstmt=null;
//		String sql="delete from person where name=?";
//		System.out.println("���� �̸� �Է�");
//		String name=sc.nextLine();
//		
//		//db����
//		conn=this.getConnection();
//		
//		try {
//			pstmt=conn.prepareStatement(sql);
//			// �ٿ��
//			pstmt.setString(1, name);
//			pstmt.execute();
//			System.out.println("�����Ǿ����ϴ�");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//			if(pstmt!=null) pstmt.close();
//			if(conn!=null) conn.close();
//		} catch (SQLException e) {
//		
//			}
//		}

	}
	public void personBloodGroup() {
		
		// ������ �� �ο����� ��� ���� ���(group by)
		/*
		 * ������	�ο���	��ճ���
		 * A��		2		32(������)
		 * B��		3		29
		 *	.... �̷������� �����Բ�
		 */
		
		// ������� �ϽŰ�
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select upper(blood) blood, count(blood) count, round(avg(age),0) age from person group by blood";
		// ���� �����ؾ���
		conn=this.getConnection();
			try {
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();	// select �Ἥ Query�� �������
				System.out.println("\t*** �������� �м�ǥ ***");
				System.out.println();
				System.out.println("������\t�ο���\t��ճ���");
				while(rs.next()) {
					String b=rs.getString("blood");
					int c=rs.getInt("count");
					int age=rs.getInt("age");
					System.out.println(b+"��\t"+c+"��\t"+age+"��");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch(SQLException e) {
					
				}
			}
		
		
		// �����Ѱ�
//		Connection conn=null;			
//		PreparedStatement pstmt=null;	
//		ResultSet rs=null;		
//		String sql="select blood, count(*), avg(age) from person group by blood";	
//		
//		
//		
//		conn=this.getConnection();		
//		try {
//			pstmt=conn.prepareStatement(sql);
//			rs=pstmt.executeQuery();
//			
//			System.out.println("\t******* ������ ��� ********");
//			System.out.println();
//			System.out.println("������\t�ο���\t��ճ���");
//			
//			
//			while(rs.next()) {
//				String blood=rs.getString("blood").toUpperCase();	// touppercase()�� �빮�ڷ� ��ȯ;
//				int count=rs.getInt("count(*)");
//				int age=rs.getInt("avg(age)");
//				
//				System.out.println(blood+"��\t"+count+"��\t"+age+"��");
//		}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(rs!=null) rs.close();
//				if(pstmt!=null) pstmt.close();
//				if(conn!=null) conn.close();
//			} catch (SQLException e) {
//				
//			}
//		}
		

	}
	
	public void personUpdate() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="update person set blood=?,age=? where num=?";
		
		int num,age;
		String blood;
		System.out.println("������ num �� �Է�");
		num=Integer.parseInt(sc.nextLine());
		System.out.println("������ blood �� �Է�");
		blood=sc.nextLine();
		System.out.println("������ age �� �Է�");
		age=Integer.parseInt(sc.nextLine());
		
		// ���� ����
		conn=this.getConnection();
		
		try {
			pstmt=conn.prepareStatement(sql);
			// ? ���� ��ŭ ���ε�
			pstmt.setString(1, blood);
			pstmt.setInt(2, age);
			pstmt.setInt(3, num);
			// ���� �����ε� ���� ��ȣ�� ���ٰ� ����ϱ�
			int n=pstmt.executeUpdate();
			if(n==0) {
				System.out.println("�ش� ��ȣ�� �������� �ʽ��ϴ�");
			}else {
				System.out.println("���� �Ǿ����ϴ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(SQLException e) {
				
			}
		}
		
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
			case 5:
				ex.personUpdate();
				break;
			default:
				System.out.println("���α׷� ����");
				System.exit(0);
			}
		}
	}

}
