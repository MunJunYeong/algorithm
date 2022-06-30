package binary;


import java.util.Arrays;

public class search43238 {
	
	public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long start = 0;
        long end = (long) n * times[times.length-1];
        long mid;
        long sum;
        
        while(start <= end) {
        	mid = (start + end) / 2;
        	sum = 0;
        	for(int i = 0; i < times.length; i++) {
        		sum += mid/times[i];
        	}
        	if(sum >=n) {
        		end = mid-1;
        		answer = mid;
        	}else {
        		start = mid+1;
        	}
        }
        return answer;
    }
}

