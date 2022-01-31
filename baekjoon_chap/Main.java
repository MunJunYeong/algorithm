import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> q = new LinkedList<>();
		
		int n = Integer.parseInt(st.nextToken()); //트럭의 수 
		int w = Integer.parseInt(st.nextToken()); //다리의 길이 
		int l = Integer.parseInt(st.nextToken()); //다리 최대 하중 
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i< n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		} // 1 : 2 2 : 4 1 : 2 8
		int time = 0;
		int weight = 0;
		
		for(int i = 0; i < n ; i++) {
			while(true) {
				if(q.isEmpty()) {
					q.offer(arr[i]); 
					time ++;
					weight += arr[i]; break;
				}else if(q.size() == w) {
					weight -= q.remove();
				}else {
					
				}
			}
		}
		
		System.out.println(time);
		
	}
	
}
