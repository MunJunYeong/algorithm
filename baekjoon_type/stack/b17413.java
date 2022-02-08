package stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class b17413 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		
		String s = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		boolean flag = false;
		
		for(int  i= 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '<') {
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				flag = true;
				sb.append(c);
			}else if (c == ' ') {
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(" ");
			}else if(!flag) {
				stack.push(c);
			}else if(flag && c=='>') {
				sb.append(c);
				flag = false;
			}else if(flag) {
				sb.append(c);
			}
			
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}
	
}

