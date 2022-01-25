package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class b9012 {
	static int [] stack;
	static int size =0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			String s= br.readLine();
			
			System.out.println(find(s));
			
		}
	}
	private static String find(String s) {
		Stack<Character> stack = new Stack();
		for(int i =0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(') {
				stack.push(c);
			}else if(stack.empty()) {
				return "NO";
			}else {
				stack.pop();
			}
		}
		if(stack.empty()) {
			return "YES";
		}else
			return "NO";
	}

	
	

	
	
}

