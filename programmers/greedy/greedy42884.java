package greedy;

import java.util.Arrays;

//단속카메라 
public class greedy42884 {
	
	public int solution(int[][] routes) {
        Arrays.sort(routes, (o1, o2)-> Integer.compare(o1[1], o2[1]));
        int cnt = 0;
        int min = Integer.MIN_VALUE;
        for(int[] route : routes) {
        	if(min < route[0]) {
        		min = route[1];
        		++cnt;
        	}
        }
        return cnt;
    }
}
