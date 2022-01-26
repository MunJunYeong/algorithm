package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b1406 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		for(int i = 0 ; i < s.length(); i++) {
			left.push(s.charAt(i));
		}
		int n = Integer.parseInt(br.readLine());
		
		for(int i =0; i < n ; i++) {
			String temp = br.readLine();
			if(temp.charAt(0) == 'L') { //move cursor left 
				if(!left.empty()) {
					right.push(left.pop());
				}
			}
			else if(temp.charAt(0) == 'D') { // move cursor right
				if(!right.empty()) {
					left.push(right.pop());
				}
			}
			else if(temp.charAt(0) == 'B'){
				if(!left.empty()) {
					left.pop();
				}
			}
			else if(temp.charAt(0) == 'P') {
				left.push(temp.charAt(2));
			}
		}
		while(!left.empty()) {
			right.push(left.pop());
		}
		StringBuilder sb = new StringBuilder();
		while(!right.empty()) {
			sb.append(right.pop());
		}
		System.out.println(sb.toString());
	}
}
