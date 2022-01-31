package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class b2164 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <=n; i++) {
			q.offer(i);
		}
		while(q.size() !=1) {
			q.poll();
			q.offer(q.poll());
		}
		System.out.println(q.peek());
	}
	
}
