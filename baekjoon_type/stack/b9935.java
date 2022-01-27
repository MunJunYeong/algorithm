package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class b9935 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String bomb = br.readLine();
		int bl = bomb.length();
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
			if(stack.size() >= bl) {
				boolean flag = false;
				for(int j = 0; j < bl; j++) {
					if(stack.get(stack.size()-bl+j) != bomb.charAt(j)){
						//폭탄문자열과 일치 하지 않다.
						flag = true;
						break;
					}
				}
				if(!flag) {
					for(int j = 0; j < bl; j++) {
						stack.pop();
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(Character value : stack) {
			sb.append(value);
		}
		
		System.out.println(sb.length() == 0 ? "FRULA" : sb);
	}
}
