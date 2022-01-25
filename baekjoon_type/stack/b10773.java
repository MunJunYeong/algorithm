package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Long> stack = new Stack<Long>();
		for(int i = 0; i < n; i++) {
			long num = Integer.parseInt(br.readLine());
			if(num == 0) {
				stack.pop();
			}else {
				stack.push(num);
			}
		}
		long sum = 0;
		while(!stack.empty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}
	
	
}
