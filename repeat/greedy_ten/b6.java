package greedy_ten;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class b6 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0; i < num; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		int cnt = 0;
		int sum = 0;
		int value = 0;
		while(!pq.isEmpty()) {
			if(cnt %2 ==0) { // 짝수번일 
 				value = pq.poll();
			}else { //홀 수 번일
				value += pq.poll();
				pq.add(value);
				sum += value;
			}
			cnt ++;
		}
		System.out.println(sum);
		
		
	}
}

