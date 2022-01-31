package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b2161 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <= n; i ++) {
			q.offer(i);
		}
		while(n-- > 0) {
			sb.append(q.poll()).append(" ");
			q.offer(q.poll());
		}
		System.out.println(sb);
		
	}
	
}

