import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int sum  = 0;
		int min = 0;
		while(a <= b) {
			if(checkPrime(a)) {
				sum+= a;
				if(min == 0) {
					min = a;
				}
			}
			a++;
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

	private static boolean checkPrime(int a) {
		if(a == 1 || a ==0) {
			return false;
		}
		if(a == 2) {
			return true;
		}
		for(int i =2; i < a; i++) {
			if(a%i ==0) {
				return false;
			}
		}
		return true;
	}
}