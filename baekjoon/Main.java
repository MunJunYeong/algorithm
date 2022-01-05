import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		
		int count  = 0;
		for(int i =0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			if(i > s.length()-1) {
				count++;
				break;
			}
			if(ch == 'c') {
				char ch2 = s.charAt(i+1);
				if(ch2 == '=') {
					count++;
					i++;
				}
				else if(ch2 == '-') {
					count ++;
					i++;
				}else {
					count ++;
				}
			}else if(ch == 'd') {
				char ch2 = s.charAt(i+1);
				if(ch2 == 'z') {
					char ch3 = s.charAt(i+2);
					if(ch3 == '=') {
						count++;
						i+=2;
					}
				}else if(ch2=='-') {
					count ++;
					i++;
				}else {
					count++;
				}
			}else if(ch == 'l') {
				char ch2 = s.charAt(i+1);
				if(ch2 == 'j') {
					count++; 
					i++;
				}else {
					count++;
				}
			}else if(ch == 'n') {
				char ch2 = s.charAt(i+1);
				if(ch2 == 'j') {
					count++; 
					i++;
				}else {
					count++;
				}
			}else if(ch == 's') {
				char ch2 = s.charAt(i+1);
				if(ch2 == '=') {
					count++; 
					i++;
				}else {
					count++;
				}
			}else if(ch == 'z') {
				char ch2 = s.charAt(i+1);
				if(ch2 == '=') {
					count++; 
					i++;
				}else {
					count++;
				}
			}else {
				count++;
			}
		}
		System.out.println(count);
		
	}

	
	
}

