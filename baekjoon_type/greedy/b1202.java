package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


class Jew {
	int m;
	int v;
	public Jew (int m, int v) {
		this.m = m;
		this.v = v;
	}
}

public class b1202 {

	static int[][] dp;
	
	static int N, K, C;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		ArrayList<Jew> list = new ArrayList<Jew>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			list.add(new Jew(m , v));
		}
		Collections.sort(list, (o1, o2)-> o1.m - o2.m); // 무게 순으로 정렬
		
		
		int weight [] = new int[K];
		for(int i = 0; i < K; i++) {
			weight[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(weight);
		
		long total=0;
		int listIdx = 0;
		PriorityQueue<Jew> pq = new PriorityQueue<Jew>((o1, o2) -> o2.v - o1.v);
		
		for(int i = 0; i < K; i++) {
			while(listIdx < N && list.get(listIdx).m <= weight[i]) {
				Jew now = list.get(listIdx++);
				pq.add(new Jew(now.m, now.v));
			}
			if(!pq.isEmpty()) {
				total += pq.poll().v;
			}
		}
		System.out.println(total);
		
		
	}
}

	
	

