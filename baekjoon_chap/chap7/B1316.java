package chap7;

import java.util.Scanner;

public class B1316 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String [] s = new String[num];
		
		for(int i = 0; i < num; i++) {
			s[i] = sc.next();
		}
		sc.close();
		
		int count= 0;
		for(int i =0; i < num; i++) {
			boolean flag = check(s[i]);
			if(flag) {
				count ++;
			}
			flag = false;
		}
		System.out.println(count);
	}

	private static boolean check(String s) {
		boolean [] check = new boolean[26];
		int prev = 0;
		for(int i = 0; i < s.length(); i++) {
			
			int num = s.charAt(i);
			
			if(prev != num) {
				if(check[num-'a'] == false) {
					check[num-'a'] = true;
					prev = num;
					
				}else {
					return false;
				}
			}
		}
		return true;
	}
}