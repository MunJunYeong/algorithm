<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		String[] a= (br.readLine().split(" "));
		int max = Integer.parseInt(a[0]);
		int min = Integer.parseInt(a[0]);
		
		for(int i=1; i < num; i++) {
			int temp = Integer.parseInt(a[i]);
			if(max < temp) {
				max = temp;
			}
			if(min > temp) {
				min = temp;
			}
			
		}
		System.out.println(min + " " + max);
=======
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
>>>>>>> bc7f11952e29797a20b06521ca694cccf24c76bb
		
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