package day0405;

public class Ex1ShopArray {

	public static void main(String[] args) {

		// Shop을 배열에 담고자 할 경우
		Shop[] shop=new Shop[3];	// 메모리 할당하기
		shop[0]=new Shop();
		shop[1]=new Shop("딸기");
		shop[2]=new Shop("복숭아",5,2000);
		
		// 두번째 방법
		Shop[] shop2= {
				new Shop(), new Shop("딸기우유"), new Shop("초콜렛"),
				new Shop("브라보콘",3,1200)
		};
		
		// 출력
		System.out.println("shop은 총"+shop.length+"개");
		for(int i=0;i<shop.length;i++) {					// 이렇게 반복문도
			System.out.println(shop[i].getSangpum()+"\t"+
					shop[i].getSu()+"\t"+shop[i].getDan()+
					"\t"+shop[i].getResult());
		}
		System.out.println();
		System.out.println();
		System.out.println("shop2는 총"+shop2.length+"개");
		for(Shop s:shop2) {									// 이렇게 반복문도 됨
			System.out.println(s.getSangpum()+"\t"+s.getSu()+"\t"+
					s.getDan()+"\t"+s.getResult());
		}
		System.out.println();
		System.out.println("shop2의 2번 배열값을 수정");
		shop2[2].setData("알사탕",5,900);
		for(Shop s:shop2) {									// 이렇게 반복문도 됨
			System.out.println(s.getSangpum()+"\t"+s.getSu()+"\t"+
					s.getDan()+"\t"+s.getResult());
		}
	}

}
