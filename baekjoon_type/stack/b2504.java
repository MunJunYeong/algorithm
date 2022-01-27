package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b2504 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		//    (()[[]])([])
		Stack<Character> stack = new Stack<Character>();
		
		int ans = 0;
		int cnt = 1;
		boolean flag = false;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(') {
				stack.push(c);
				cnt *= 2;
			}else if(c == '[') {
				stack.push(c);
				cnt*=3;
			}else {
				if(c == ')') {
					if(stack.empty() || stack.peek()!='(') {
						flag = true; break;
					}
					if(s.charAt(i-1) == '(') {
						ans += cnt;
					}
					stack.pop();
					cnt /=2;
				}else if(c == ']') {
					if(stack.empty() || stack.peek()!= '[') {
						flag = true; break;
					}
					if(s.charAt(i-1) == '[') {
						ans += cnt;
					}
					stack.pop();
					cnt /=3;
				}
			}
		}
		if(flag || !stack.empty()) {
			System.out.println(0);
		}else 
			System.out.println(ans);
		
		
	}
}
