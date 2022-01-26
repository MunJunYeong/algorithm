package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b4949 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			Stack<Character> s1 = new Stack<Character>(); // (
			String s = br.readLine();
			String temp = "";
			
			if(s.charAt(0) == '.') {
				break;
			}else {
				for(int i = 0; i < s.length(); i ++) {
					char c= s.charAt(i);
					
					if(c == '(') {
						s1.push(c);
					}else if(c== '[') {
						s1.push(c);
					}else if(c==')') {
						if(s1.empty() || s1.peek() == '[') {
							temp = "no";
						}else {
							s1.pop();
						}
					}else if(c==']') {
						if(s1.empty() || s1.peek() == '(') {
							temp = "no";
						}else {
							s1.pop();
						}
					}
				}
				if(temp == "no") {
					sb.append("no").append('\n');
				}else if(!s1.empty()){
					sb.append("no").append('\n');
				}else {
					sb.append("yes").append('\n');
				}
				
			}
			
		}
		System.out.println(sb);
		
	}
}

