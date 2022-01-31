package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b1966 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			LinkedList<int[]> q = new LinkedList<int[]>();
			
			st = new StringTokenizer(br.readLine());
			for(int i =0; i <n; i++) {
				q.offer(new int[] { // 초기위치, 중요도 
						i, Integer.parseInt(st.nextToken())
				});
			} // 초기값 세팅 queue에 전부 다 담아준다.
			int cnt = 0;
			while(!q.isEmpty()) {
				int[] front = q.poll(); // 가장 첫 원소 빼주
				boolean isMax  = true; // front가 가장 큰 원소인지 비
				// 큐에 남아있는 원소 비교 
				for(int i =0; i < q.size(); i++) {
					if(front[1] < q.get(i)[1]) {
						q.offer(front);
						for(int j = 0; j < i; j++) {
							q.offer(q.poll());
						}
						isMax = false;
						break;
					}
				}
				if(!isMax) {
					continue;
				}
				cnt++;
				if(front[0] == m) {
					break;
				}
				
			}
			sb.append(cnt).append('\n');
		}
		System.out.println(sb);
		
	}
	
}

