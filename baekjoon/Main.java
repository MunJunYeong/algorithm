import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		sc.close();
		int count  = 0;
		for(int i = 0; i < s.length(); i++ ){
			
			char c = s.charAt(i);
			
			if(c == 'c') {
				if(i < s.length()-1) {
					if(s.charAt(i+1) == '=') {
						i++;
					}else if(s.charAt(i+1) == '-') {
						i++;
					}
				}
			}
			if(c == 'd') {
				if(i < s.length()-1) {
					if(s.charAt(i+1) == 'z') {
						if(i < s.length()-2) {
							if(s.charAt(i+2) == '=') {
								i+= 2;
							}
						}
					}
					else if(s.charAt(i+1) == '-') {
						i++;
					}
				}
			}
			if(c == 'l') {
				if(i < s.length()-1) {
					if(s.charAt(i+1) == 'j') {
						i++;
					}
				}
			}
			if(c == 'n') {
				if(i < s.length()-1) {
					if(s.charAt(i+1) == 'j') {
						i++;
					}
				}
			}
			
			if(c == 's') {
				if(i < s.length()-1) {
					if(s.charAt(i+1) == '=') {
						i++;
					}
				}
			}
			if(c == 'z') {
				if(i < s.length()-1) {
					if(s.charAt(i+1) == '=') {
						i++;
					}
				}
			}
			
			
			count +=1;
		}
		System.out.println(count);
		
	}
}