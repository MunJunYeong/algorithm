
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Tomato5{
	int x;
	int y ;
	public Tomato5(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int N, M, K;
	static int vertex, edge;
	
	static int arr[][];
	static boolean visit[];
	
	static int xA[] = {-1, 1, 0, 0};
	static int yA[] = {0, 0, -1, 1};
	
	
	static Queue<Tomato5> q= new LinkedList<Tomato5>();
	
	static ArrayList<Integer>[] list;
	static int[] paraent;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		list = new ArrayList[N+1];
		paraent = new int[N+1];
		visit = new boolean[N+1];
		
		for(int i =0;i < N+1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 1; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i = 1; i < N+1; i++) {
			if(!visit[i]) {
				dfs(i);
			}
		}
		
//		for(int i = 2; i < N+1; i++) {
//			System.out.println(paraent[i]);
//		}
		for(int value : list[4]) {
			System.out.println(value);
		}
		
//		System.out.println(paraent[2]);
		
	}

	private static void dfs(int i) {
		if(visit[i]) return;
		
		visit[i] = true;
		for(int value : list[i]) {
			if(!visit[value]) {
				paraent[value] = i;
				dfs(value);
			}
		}
		
	}
}

	
	

