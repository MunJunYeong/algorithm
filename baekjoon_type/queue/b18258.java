package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b18258 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> q = new LinkedList<>();
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push" :
				q.offer(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop" :
				Integer item = q.poll();
				if(item == null) {
					sb.append(-1).append('\n');
				}else 
					sb.append(item).append('\n');
				break;
				
			case "size" :
				sb.append(q.size()).append('\n');
				break;
				
			case "empty" :
				if(q.isEmpty()) {
					sb.append(1).append('\n');
				}else 
					sb.append(0).append('\n');
				break;
				
			case "front" :
				Integer front = q.peekFirst();
				if(front == null) {
					sb.append(-1).append('\n');
				}else
					sb.append(front).append('\n');
				break;
				
			case "back" :
				Integer back = q.peekLast();
				if(back == null) {
					sb.append(-1).append('\n');
				}else
					sb.append(back).append('\n');
				break;
			}
		}
		System.out.println(sb);
	}
	
}

