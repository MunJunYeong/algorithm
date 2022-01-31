package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b1158 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Deque<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <=n; i++) {
			q.offer(i);
		}
		sb.append('<');
		while(q.size()>1) {
			for(int i = 1;  i<k; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()).append(", ");
		}
		sb.append(q.poll()).append('>');
		System.out.println(sb);
	}
	
}
