package day0317;

public class Ex6ArrayMunJe {

	public static void main(String[] args) {
		
	
//		int max=0, min;
//		int cng=0;
//		
//		
//		
//		for(int i=0;i<data.length;i++) {
//			if(data[i] < data[i+1]) {
//				cng=data[i];
//				data[i] = data[i+1];
//				data[i+1] = cng;
//				max = data[0];
//				System.out.print(data[i]);
//			}	
//		}
//		
		
		
		
//		int max, min;
//		max=data[0];
//		min=data[0];
//		
//		for(int i=1;i<data.length;i++) {
//			if(max<data[i]) {
//				max=data[i];
//			}
//			if(min>data[i]) {
//				min=data[i];
//			}
//		}
//		System.out.println("max = "+max);
//		System.out.println("min = "+min);
		
		
		
		int data[]={100,-56,67,89,230,-800,32,39,69,11,-9,8,25,33,77};
		
		int max, min;
		max=data[0];
		min=data[0];
		
		for(int i=0;i<data.length;i++) {
			if(max < data[i]) {
				max = data[i];
			}
			if(min > data[i]) {
				min = data[i];
			}
		}
		System.out.println("max = "+max);
		System.out.println("min = "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
