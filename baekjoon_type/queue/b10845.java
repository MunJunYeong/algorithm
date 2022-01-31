package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b10845 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> q = new LinkedList<>();
		
		StringTokenizer st;
		for(int i= 0; i < n; i ++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
			
				case "push" :
					q.offer(Integer.parseInt(st.nextToken()));
					break;
					
				case "pop" :
					Integer popItem = q.poll();
					if(popItem == null) {
						sb.append(-1).append('\n');
					}else {
						sb.append(popItem).append('\n');
					}
					break;
					
				case "front" :
					Integer front= q.peek();
					if(front == null) {
						sb.append(-1).append('\n');
					}else {
						sb.append(front).append('\n');
					}
					break;
					
				case "back" :
					Integer last = q.peekLast();
					if(last == null) {
						sb.append(-1).append('\n');
					}else
						sb.append(last).append('\n');
					break;
					
				case "size" :
					sb.append(q.size()).append('\n');
					break;
					
				case "empty" :
					if(q.isEmpty()) {
						sb.append(1).append('\n');
					}else {
						sb.append(0).append('\n');
					}
					break;
			}
		}
		System.out.println(sb);
	}
	
}

