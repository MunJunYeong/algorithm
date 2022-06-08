package sort;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort42748 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		answer = new int[commands.length];
    	for(int t = 0; t < commands.length; t++) {
    		int i = commands[t][0];
    		int j = commands[t][1];
    		int k = commands[t][2];
    		
    		
    		List<Integer> temp = new ArrayList<>();
    		for(int t2  = i-1; t2 < j; t2++) {
    			temp.add(array[t2]);
    		}
    		Collections.sort(temp);
    		answer[t] = temp.get(k-1);
    	}
        return answer;
    }
}
