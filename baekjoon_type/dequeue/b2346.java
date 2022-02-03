package dequeue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class b2346 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Deque<int[]> dq = new ArrayDeque<int[]>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <=n; i++) {
			dq.offer(new int[]{
				i, Integer.parseInt(st.nextToken())
			});
		}
		StringBuilder sb =new StringBuilder();
		while(dq.size() != 1) {
			int [] temp = dq.poll();
			sb.append(temp[0]).append(" ");
			
			if(temp[1] >0) { // 양수일 경우에 오른쪽 
				for(int i = 1; i < temp[1]; i++) {
					dq.offer(dq.poll());
				}
				
			}else {
				for(int i =0; i >temp[1]; i--) {
					dq.offerFirst(dq.pollLast());
				}
			}
		}
		int [] temp = dq.poll();
		sb.append(temp[0]).append(" ");
		System.out.println(sb);
		// 1  2    3   4   5
		
	}
	
}


