package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10828 {
	static int [] stack;
	static int size =0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		stack = new int[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch(s) {
				case "push" :
					push(Integer.parseInt(st.nextToken()));
					break;
			
				case "pop" :
					System.out.println(pop());
					break;
					
				case "size" :
					size();
					break;
					
				case "empty" :
					empty();
					break;
					
				case "top" :
					top();
					break;
					
			}
				
		}
		
	}
	public static void push(int n) {
		stack[size] = n;
		size ++;
	}
	public static int pop() {
		if(size ==0) {
			return -1;
		}else {
			int temp = stack[size-1];
			stack[size-1] = 0;
			size --;
			return temp;
		}
		
	}
	public static void size() {
		System.out.println(size);
	}
	public static void empty() {
		if(size == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	public static void top() {
		if(size ==0) {
			System.out.println(-1);
		}else {
			System.out.println(stack[size-1]);
		}
	}
	
	
}

