package day0407;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex3FileObject {
	public static final String FILENAME="C:\\��Ʈķ�� 0314\\javawork\\shop.txt";
	
	public static void shopSave() {
		Scanner sc=new Scanner(System.in);
		System.out.println("��ǰ��");
		String sang=sc.nextLine();
		System.out.println("����");
		String color=sc.nextLine();
		System.out.println("�ܰ�");
		int price=Integer.parseInt(sc.nextLine());
		
		// Shop ��ü ����
		Shop shop=new Shop(sang, color, price);
		
		//Object ������ �����ϴ� ���
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(FILENAME);
			oos=new ObjectOutputStream(fos);
			//Object ������ �����ϱ�
			oos.writeObject(shop);	// Object ��ü�� �� �����ϴ°�
			System.out.println("���� �Ϸ�");
		} catch (FileNotFoundException e) {		// fos=new ~~
			// TODO Auto-generated catch block
			System.out.println("���� ����");
		} catch (IOException e) {	// oos=new ~~
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null) oos.close();
				if(fos!=null) fos.close();
			}catch (IOException e) {
				
			}
		}
		
	}
	public static void shopRead() {
		System.out.println("���Ͽ��� ���� shop ����Ÿ ���");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		

		
		try {
			fis=new FileInputStream(FILENAME);
			ois=new ObjectInputStream(fis);
			
			// ���Ͽ��� shop ������ �б�
			Shop shop=(Shop)ois.readObject();
			System.out.println("��ǰ�� : "+shop.getSang());
			System.out.println("���� : "+shop.getColor());
			System.out.println("�ܰ� : "+shop.getPrice());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try{
				if(ois!=null) ois.close();
				if(fis!=null) fis.close();
			} catch (IOException e) {
				
			}
		}
	}


	public static void main(String[] args) {
		
		shopSave();
		shopRead();
	}

}
