package day0316;

public class Ex1MunJe {

	public static void main(String[] args) {
		
		
		int cnt=0, ran, bocsa;
		int rnd;
		rnd = (int)(Math.random()*100)+1;
		System.out.println("rnd�� ���� "+rnd+"�Դϴ�");
		
		
		while(true) {
			
			ran = (int)(Math.random()*100)+1;
			
			
//			if(rnd <= ran) {
//				
//			}
			
			cnt++;
			
			if(rnd == ran) {
				System.out.println(cnt+"��° : "+ran);
				System.out.println("�¾Ҿ��!!! ������ "+rnd+"�Դϴ�" );
				break;
			}else if(rnd <= ran) {
				System.out.println(cnt+"��° : "+ran);
				System.out.println(ran+"���� �۽��ϴ�");
				if(cnt == 10) {
					System.out.println("�ð��ʰ�!!");
					break;
				}
				continue;
			}else {
				System.out.println(cnt+"��° : "+ran);
				System.out.println(ran+"���� Ů�ϴ�");
				if(cnt == 10) {
					System.out.println("�ð��ʰ�!!");
					break;
				}
				continue;
			}
			
		}
		System.out.println("���α׷��� �����մϴ�");
		
		
		
		
		
		
		
		
	}

}
