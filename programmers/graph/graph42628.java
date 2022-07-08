package graph;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class graph42628 {
	public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        
        int tempCnt = 0;
        for(int i = 0; i < operations.length; i++) {
        	StringTokenizer st = new StringTokenizer(operations[i]);
        	String op = st.nextToken();
        	switch(op) {
	        	case "I" : {
	        		if(tempCnt == 0) {
	        			minPq.clear();
	        			maxPq.clear();
	        		}
	        		int num = Integer.parseInt(st.nextToken());
	        		minPq.add(num);
	        		maxPq.add(num);
	        		tempCnt++;
	        		break;
	        	}
	        	case "D" : {
	        		if(tempCnt == 0) {
	        			if(tempCnt == 0) {
		        			minPq.clear();
		        			maxPq.clear();
		        		}
	        			break;
	        		}
	        		tempCnt--;
	        		String op2 = st.nextToken();
	        		if(op2.equals("1")) { //최대값 삭제
	        			maxPq.poll();
	        		}else { //최소값 삭제
	        			minPq.poll();
	        		}
	        		break;
	        	}
        	}
        }
        
        if(tempCnt == 0) {
        	answer[0] = 0; answer[1] = 0;
        }else if(tempCnt == 1){
        	int num = minPq.poll();
        	if(num >0) {
        		answer[0] = num; answer[1] = 0;
        	}else {
        		answer[0] = 0; answer[1] = num;
        	}
        }else {
        	int max = maxPq.poll();
        	int min = minPq.poll();
        	answer[0] = max; answer[1] = min;
        }
        System.out.println(answer[0] + " " + answer[1]);
        return answer;
    }
}