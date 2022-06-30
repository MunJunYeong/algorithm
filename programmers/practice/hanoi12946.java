package practice;


import java.util.ArrayList;
import java.util.List;

public class hanoi12946 {
	List<int []> list;
	public int[][] solution(int n) {
        
         list = new ArrayList<>();
         
         hanoi(1, 2, 3, n);
        
         int[][] answer = new int[list.size()][2];
         for(int i = 0; i < list.size(); i++) {
        	 int [] temp = list.get(i);
        	 answer[i][0] = temp[0];
        	 answer[i][1] = temp[1];
         }
        return answer;
    }

	private void hanoi(int start, int via, int end, int n) {
		int [] move = {start, end};
		
		if(n == 1) {
			list.add(move);
		}else {
			hanoi(start, end, via, n-1);
			list.add(move);
			hanoi(via, start, end, n-1);
		}
	}
}
