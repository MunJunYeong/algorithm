package chap2;

public class PrimeNumber {

	public static void main(String[] args) {
		int counter = 0;
		for(int i =2; i <=10; i++) {
			int j;
			
			for(j=2; j<i; j++) {
				counter++;
				if(i%j==0) {
					break;
				}
			}
			if(j==i) {
				System.out.println(j);
			}
			
		}
//		System.out.println(counter);// 나눈 
	}

}
