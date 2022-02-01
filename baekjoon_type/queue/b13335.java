package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b13335 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //트럭의 수 
		int w = Integer.parseInt(st.nextToken()); //다리의 길이 
		int l = Integer.parseInt(st.nextToken()); //다리 최대 하중 
	
		st = new StringTokenizer(br.readLine());
		LinkedList<Integer> truck = new LinkedList<>();
		
		for(int i = 0; i< n; i++) {
			truck.offer(Integer.parseInt(st.nextToken()));
		}
		int time = 0;
		int bw  =0 ; //다리 무게 
		
		LinkedList<Integer> q = new LinkedList<>();
		
		for(int i = 0; i < w; i++) { // 다리 길이만큼 
			q.add(0);
		}
		
		while(!q.isEmpty()) {
			time++;
			bw -= q.poll();
			if(!truck.isEmpty()) {
				if(truck.peek()+bw  <= l) {
					bw += truck.peek();
					q.offer(truck.poll());
				}else {
					q.offer(0);
				}
			}
		}
		System.out.println(time);
	}
	
}

