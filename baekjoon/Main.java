
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public class Jewelry {
		int mass; //무게 
		int value;//가격 
		public Jewelry (int m, int v) {
			this.mass = m;
			this.value = v;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		// 0 = 무게, 1 = 가격 
		Main.Jewelry[] jewelry = new Jewelry[n];
		
		for(int i = 0; i < n; i ++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st2.nextToken());
			int v = Integer.parseInt(st2.nextToken());
			jewelry[i] = new Jewelry(m, v);
		}
		Arrays.sort(jewelry, (o1, o2) ->{
 			if(o1[1] == o2[1]) {
 				return o1[0] - o2[0];
 			}else
 				return o1[1] - o2[1];
 		});
		Arrays.sort(maxBag);
		long ans = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for(int i =0, j=0 ; i < bag; i++) {
			while(j < n && arr[j][0] <= maxBag[j]) {
				pq.offer(arr[j][1] ++);
			}
			if(!pq.isEmpty()) {
				ans += pq.poll();
			}
		}
		System.out.println(ans);
	}
}
