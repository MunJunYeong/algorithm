package dequeue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b13417 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Deque<Character> dq = new LinkedList<Character>();
		StringBuilder sb = new StringBuilder();
		while(n-- > 0) {
			
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				char ch = st.nextToken().charAt(0);
				if(dq.isEmpty()) {
					dq.add(ch);
				}else {
					if(dq.peek() >= ch) {
						dq.offerFirst(ch);
					}else {
						dq.offer(ch);
					}
				}
			}
			while(!dq.isEmpty()) {
				sb.append(dq.poll());
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
	}
	
}

