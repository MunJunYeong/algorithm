package dequeue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b1021 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // q size
		int p = Integer.parseInt(st.nextToken()); // pick np

		LinkedList<Integer> dq = new LinkedList<Integer>();
		for(int i = 1; i <= n; i ++) {
			dq.offer(i);
		}
		
		st = new StringTokenizer(br.readLine());
		LinkedList<Integer> ansDq = new LinkedList<Integer>();
		for(int i = 0; i < p ; i++) {
			ansDq.offer(Integer.parseInt(st.nextToken()));
		}
		
		
		// 첫 번째 원소 제거, 왼쪽으로 이동, 오른쪽으로 이동 
		int cnt = 0;
		while(!ansDq.isEmpty()) {
			int ans = ansDq.poll(); // first pick no
			int temp = 0; // dq first no
			
			int ansIdx = dq.indexOf(ans);
			int idx = dq.size()/2;
			
			while(true) {
				temp = dq.peek();
				if(temp == ans ) {
					break;
				}else if(ansIdx > idx   ) { // left
					int item = dq.pollLast();
					dq.offerFirst(item);
				}else {
					int item = dq.pollFirst();
					dq.offerLast(item);
				}
				cnt++;
			}
			dq.poll();
		}
		System.out.println(cnt);
	}
	
}


