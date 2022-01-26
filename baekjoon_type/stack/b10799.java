package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b10799 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Stack<Integer> stack = new Stack<Integer>();
		
		int cnt = 0;
		int idx = 1;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(') {
				stack.push(idx);
			}else { // )
				if(idx - stack.peek() == 1) {
					stack.pop();
					cnt += stack.size();
				}else {
					stack.pop();
					cnt+=1;
				}
			}
			idx++;
		}
		System.out.println(cnt);
	}
}
