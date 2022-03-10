package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


class NodeA9 implements Comparable<NodeA9>{
	int idx;
	int cost;
	public NodeA9 (int i, int c){
		this.idx = i;
		this.cost = c;
	}
	@Override
	public int compareTo(NodeA9 o) {
		return this.cost - o.cost;
	}
}

public class a9 {
	static int N, M;
	static int vertex, edge;
	static int start;
	static int u, v, w;
	
	static int arr[][];
	static boolean visit[][] ;
	
	static int[] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0, 0, -1, 1};
	
	static int res = Integer.MIN_VALUE;
	
	//거리 배열
	static int [] dist;
	// 인접리스트
	static ArrayList[] adjList;
	
//	PriorityQueue<>
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N 세로 , M 가로
		StringTokenizer st=  new StringTokenizer(br.readLine());
		vertex = Integer.parseInt(st.nextToken());
		edge = Integer.parseInt(st.nextToken());
		
		start = Integer.parseInt(br.readLine());
		
		//거리 배열 무한대로 초기화
		dist = new int[vertex+1];
		for(int i = 1; i < vertex+1; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		//인접리스트 초기화
		adjList = new ArrayList[vertex+1];
		for(int i = 1; i < vertex+1; i++) {
			adjList[i] = new ArrayList<NodeA9>();
		}
		
		for(int i = 1; i < edge+1; i++) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			
			adjList[u].add(new NodeA9(v, w));
		}
		
		dijkstra(start);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < vertex+1;i ++) {
			if(dist[i]== Integer.MAX_VALUE) {
				sb.append("INF\n");
			}else {
				sb.append(dist[i] + "\n");
			}
		}
		System.out.println(sb);
		
	}

	private static void dijkstra(int start) {
		PriorityQueue<NodeA9> pq = new PriorityQueue<>();
		dist[start] = 0;
		pq.add(new NodeA9(start, 0));
		while(!pq.isEmpty()) {
			NodeA9 now = pq.poll();
			
			//더 큰 가중치로 도착할 경우에는 넘겨버린다.
			if(now.cost > dist[now.idx]) continue;
			
			int len = adjList[now.idx].size();
			for(int i = 0; i < len; i++) {
				NodeA9 next = (NodeA9) adjList[now.idx].get(i);
				
				if(dist[next.idx] > now.cost + next.cost) {
					dist[next.idx] = now.cost + next.cost;
					pq.add(new NodeA9(next.idx, dist[next.idx]));
				}
				
			}
			
			
		}
	}
}

	
	

