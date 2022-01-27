package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b5397 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			Stack<Character> left = new Stack<Character>();
			Stack<Character> right = new Stack<Character>();
			String s = br.readLine();
			for(int j = 0; j < s.length(); j++) {
				char c=  s.charAt(j);
				if( (c >= 'A' && c <='Z') || (c >='a' && c <='z') || (c >='0' && c<='9') ) {
					left.push(c);
				}else {
					if(c == '<') {
						if(!left.empty()) {
							right.push(left.pop());
						}
					}else if(c == '>') {
						if(!right.isEmpty()) {
							left.push(right.pop());
						}
					}else if(c == '-') {
						if(!left.isEmpty()) {
							left.pop();
						}
					}
				}
			}
			while(!left.isEmpty()) {
				right.push(left.pop());
			}
			while(!right.isEmpty()) {
				sb.append(right.pop());
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}

