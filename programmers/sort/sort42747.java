package sort;

import java.util.Arrays;

public class sort42747 {
	public int solution(int[] arr) {
        int ans = 0;
        
        Arrays.sort(arr);
        // 0 1 3 5 6
        for(int i = 0; i < arr.length;i++) {
        	int h = arr.length-i;
        	if(arr[i] >= h) {
        		ans = h;
        		break;
        	}
        }
        return ans;
    }
}
