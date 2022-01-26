package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b17298 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i<n; i++) {
			
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i] ) {
				arr[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		
		while(!stack.empty()) {
			arr[stack.pop()] = -1;
		}
		
		for(int i = 0; i < n ; i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb);
		
	}
}
