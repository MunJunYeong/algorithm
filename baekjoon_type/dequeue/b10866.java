package dequeue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class b10866 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Deque<Integer> dq = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		while(n-- > 0) {
			st= new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push_front" :
				dq.offerFirst(Integer.parseInt(st.nextToken()));
				break;
				
			case "push_back" :
				dq.offerLast(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop_front" :
				if(!dq.isEmpty()) {
					sb.append(dq.pollFirst()).append('\n');
				}else {
					sb.append(-1).append('\n');
				}
				break;
				
			case "pop_back" :
				if(!dq.isEmpty()) {
					sb.append(dq.pollLast()).append('\n');
				}else {
					sb.append(-1).append('\n');
				}
				break;
				
			case "size" :
				sb.append(dq.size()).append('\n');
				break;
				
			case "empty" :
				if(dq.isEmpty()) {
					sb.append(1).append('\n');
				}else {
					sb.append(0).append('\n');
				}
				break;
				
			case "front" :
				if(!dq.isEmpty()) {
					sb.append(dq.peekFirst()).append('\n');
				}else {
					sb.append(-1).append('\n');
				}
				break;
				
			case "back" :
				if(!dq.isEmpty()) {
					sb.append(dq.peekLast()).append('\n');
				}else {
					sb.append(-1).append('\n');
				}
				break;
			}
			
		}
		System.out.println(sb);
		
	}
	
}

