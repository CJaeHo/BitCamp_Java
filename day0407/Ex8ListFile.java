package day0407;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex8ListFile {
	public static final String FILENAME="C:\\��Ʈķ�� 0314\\javawork\\person.txt";
	List<Person> list;
	Scanner sc;
	
	public Ex8ListFile() {
		list=new Vector<Person>();
		sc=new Scanner(System.in);
		
		fileRead();		// �����ڿ��� ����
	}
	
	// ó�� ���� �� ������ �о list�� ����Ÿ �ֱ�
	public void fileRead() {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			while(true) {
				String line=br.readLine();
				if(line==null) {
					break;
				}
				String[] s=line.split(",");
				Person p=new Person();
				p.setName(s[0]);
				p.setGender(s[1]);
				p.setAddr(s[2]);
				// list�� �߰�
				list.add(p);
			}
			System.out.println("�� "+list.size()+"���� ����Ÿ �о��");
		}catch(FileNotFoundException e) {
			System.out.println("����� ����Ÿ ����");
		} catch (IOException e) {	//br.readLine(); �̰��� catch
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			}catch(IOException e) {
				
			}
		}
	}
	public void fileWrite() {
		// FileWriter ���� �� list�� ������ �����ϱ� (�޸��� �����ؼ� ����)
		
	
			FileWriter fw=null;						// �ʱⰪ
			try {									// try catch���ְ�
				fw=new FileWriter(FILENAME);		// fw�� FILENAME�� person.txt�� �ְ� 
				for(Person p:list) {				// Person p�� �ݺ��� ������ s������ ä���־�. �޸��� ����
					String s=p.getName()+","+p.getGender()+","+p.getAddr()+"\n";
					fw.write(s);					
				}
			}catch(IOException e){
				e.printStackTrace();
			}finally {
				if(fw!=null) {
					try {
						if(fw!=null) fw.close();
					}catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
	}
	// �޴����� �Է� �� ����... main���� �ص��Ǵµ� ����??
	public int getMenu() {
		System.out.println("** �޴� ���� **");
		System.out.println("1.�߰�	2.��ü���	3.����	5.���� �� ����");
		int n=Integer.parseInt(sc.nextLine());
		return n;
	}
	
	// �̸����� ã�Ƽ� �����ϱ�
	public void dataDelete() {
		boolean find=false;		// ó���� false�� �ְ�
		String searchName;
		System.out.println("������ �̸��� �Է��ϼ���");
		searchName=sc.nextLine();
		
		for(int i=0;i<list.size();i++) {
			Person p=list.get(i);	// list.get�� �ҷ��ͼ� i��° Person�� ���
			// �׸��� ���ϱ�
			if(searchName.equals(p.getName())) {	// �ҷ��� Person�� Name�� searchName�� �Էµ� �̸��� ���ϱ�
				find=true;		// ã���� true�� ����
				list.remove(i);	// i��° ����Ÿ�� ����
				break;
			}
		}
		if(find) {
			System.out.println(searchName+"���� ����Ÿ�� �����Ͽ����ϴ�");
		}else {
			System.out.println(searchName+"���� ��ܿ� �����ϴ�");
		}
		
	}
	
	
	// ����Ÿ �Է� �� list�� �߰��ϴ� �޼���
	public void dataAdd() {
		System.out.println("�̸�");
		String name=sc.nextLine();
		System.out.println("����");
		String gender=sc.nextLine();
		System.out.println("�ּ�");
		String addr=sc.nextLine();
		
		// Person ��ü ����
		Person p=new Person();
		p.setName(name);
		p.setGender(gender);
		p.setAddr(addr);
		
		// list�� �߰�
		list.add(p);
		
		System.out.println(list.size()+"��° ����Ÿ�� �߰��Ǿ����ϴ�");
	}
	
	// ��ü ���
	public void dataAllWrite() {
		System.out.println("��ȣ\t�̸�\t����\t�ּ�");
		System.out.println("----------------------");
		int n=0;
		for(Person p:list) {
			System.out.println(++n+"\t"+p.getName()+"\t"+p.getGender()+"\t"+p.getAddr());
		}
	}
	
	
	public static void main(String[] args) {
		Ex8ListFile ex=new Ex8ListFile();		// ������ ���� 
		while(true) {
			int n=ex.getMenu();
			switch(n) {
			case 1:
				ex.dataAdd();
				break;
			case 2:
				ex.dataAllWrite();
				break;
			case 3:
				ex.dataDelete();
				break;
			case 5:
				System.out.println("���� �� ���α׷��� �����մϴ�");
				ex.fileWrite();
				System.exit(0);
			}
			System.out.println();
		}
	}

}
