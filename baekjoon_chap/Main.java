
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
	static int N, M;
	static int vertex, edge;
	
	static int arr[][];
	static boolean visit[][] ;
	
	static int[] xArr = {-1, -2, -2, -1, 1, 2, 2, 1};
	static int[] yArr = {-2, -1, 1, 2, -2, -1, 1, 2};
	
	static int x1, x2, y1, y2;
	
	static Queue<Tomato5> q= new LinkedList<Tomato5>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		visit = new boolean[N][M];
		for(int i = 0; i < N ; i++) {
			String s = br.readLine();
			for(int j = 0; j < M; j++) {
				char c= s.charAt(j);
				arr[i][j] = c-'0';
			}
		}
		
		
		
		System.out.println(arr[N-1][M-1]);
	}
}

	
	

