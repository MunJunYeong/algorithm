package c6;

public class a2 {
	public static void main(String[] args)     {
		boolean flag [] = new boolean[10001];
		
		for(int i =1; i < 10001; i++) {
			int n  = findPrimeNumber(i);
			if(n < 10001) {
				flag[n] = true;
			}
		}
		for(int i =1; i < 10001; i++) {
			if(!flag[i]) {
				System.out.println(i);
			}
		}
	}

	private static int findPrimeNumber(int n) {
		int sum = n;
		while(n != 0) {
			sum = sum + n%10;
			n = n /10;
		}
		return sum;
	}
}
