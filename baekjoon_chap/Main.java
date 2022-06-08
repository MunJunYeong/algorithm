import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		
	}

	private static int Solution(int[] array, int[][] commands) {
		List<Integer> arr = new ArrayList<Integer>();
		
		return 0;
	}
	
	private static boolean validatePrime(int n) {
		if(n < 2) return false;
		for(int i =2; i*i <=n;i++) {
			if(n% i == 0) return false;
		}
		return true;
	}
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
    	List<Integer> list = new ArrayList<Integer>();
    	for(int t = 0; t < commands.length; t++) {
    		int i = commands[t][0];
    		int j = commands[t][1];
    		int k = commands[t][2];
    		
    		int len = j-i+1;
    		int temp[] = new int[len];
    		int tempStart = i-1;
    		for(int t2 = 0; t2 < len; t2++) {
    			temp[t2] = array[tempStart++];
    		}
    		Arrays.sort(temp);
    		list.add(temp[k-1]);
    	}
        int[] answer = {};
        for(int i = 0; i< list.size();i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}