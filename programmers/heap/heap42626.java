package heap;

import java.util.PriorityQueue;

public class heap42626 {
	
	public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i < scoville.length; i++) {
        	pq.add(scoville[i]);
        }
        
        while(true) {
        	int temp = pq.poll();

        	if(temp > K) break;
        	if(pq.isEmpty()) {
        		answer = -1; break;
        	}
        	
        	int temp2 = pq.poll() *2;
        	pq.add(temp + temp2);
        	answer++;
        }
        return answer;
    }
}
