package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b1918 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < s.length(); i ++) {
			char c = s.charAt(i);
			if(c >='A' && c <= 'Z') {
				sb.append(c);
			}else {
				
				if(c == '(') {
					stack.push(c);
					
				}else if(c == ')') {
					while(!stack.empty() && stack.peek() != '(') {
						sb.append(stack.pop());
					}
					if(!stack.empty()) {
						stack.pop();
					}
					
				}else {
					while(!stack.empty() && checkPriority(stack.peek()) >= checkPriority(c)) {
						sb.append(stack.pop());
					}
					stack.push(c);
				}
			}
		}
		while(!stack.empty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
		
	}

	private static int checkPriority(Character c) {
		if(c== '*' || c=='/') {
			return 2;
		}else if(c == '+' || c== '-') {
			return 1;
		}else {
			return 0;
		}
	}
}

