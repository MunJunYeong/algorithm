package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node  implements Comparable<Node>{
	int vertex, weight;
	public Node(int v, int w) {
		this.vertex = v;
		this.weight = w;
	}
	@Override
	public int compareTo(Node o) {
		return weight - o.weight;
	}
}

public class b1735 {
	static int v, e, start;
	static ArrayList<Node>[] list;
	static int [] dist;
	static int INF = Integer.MAX_VALUE;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		v= Integer.parseInt(st.nextToken());
		e= Integer.parseInt(st.nextToken());
		start=  Integer.parseInt(br.readLine());
		
		list = new ArrayList[v+1];
		dist = new int[v+1];
		Arrays.fill(dist, INF);
		for(int i = 1; i < v+1; i++) {
			list[i] = new ArrayList<Node>();
		}
		
		for(int i = 0 ; i< e; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st1.nextToken());
			int v = Integer.parseInt(st1.nextToken());
			int w = Integer.parseInt(st1.nextToken());
			list[u].add(new Node(v, w));
		}
		
		dijkstra();
		
		for(int i = 1; i < v+1; i++) {
			if(dist[i] == INF) {
				System.out.println("INF");
			}else {
				System.out.println(dist[i]);
			}
		}
		
		
		
	}

	private static void dijkstra() {
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		dist[start] = 0;
		q.add(new Node(start, 0));
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			int vertex = node.vertex;
			int weight = node.weight;
			if(dist[vertex] < weight) continue;
			
			for(int i =0; i < list[vertex].size(); i++) {
				int vertex2 = list[vertex].get(i).vertex;
				int weight2 = list[vertex].get(i).weight + weight;
				if(dist[vertex2] > weight2) {
					dist[vertex2] = weight2;
					q.add(new Node(vertex2, weight2));
				}
			}
			
		}
		
	}
}

	
	

