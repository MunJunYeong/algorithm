package queue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class b15828 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		
		int size = Integer.parseInt(br.readLine()); // buffer size
		Queue<Integer> q = new LinkedList<Integer>();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == -1) {
				break;
			}
			if(n == 0) {
				q.poll();
			}else {
				if(q.size() <size) {
					q.offer(n);
				}
			}
		}
		if(q.isEmpty()) {
			System.out.println("empty");
		}else {
			while(!q.isEmpty()) {
				sb.append(q.poll()).append(' ');
			}
			System.out.println(sb);
		}
		
	}
	
}


