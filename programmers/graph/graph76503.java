package graph;

import java.util.ArrayList;


//모두 0으로 만들기 
public class graph76503 {
	
	long answer = 0;
	boolean visited[];
	long arr[];
	ArrayList<Integer>[] node;
	
	public long solution(int[] a, int[][] edges) {
		visited = new boolean[a.length];
		arr = new long[a.length];
		node = new ArrayList[a.length];
		
		long sum = 0;
		for(int i = 0; i < a.length;i++) {
			sum += a[i];
			node[i] = new ArrayList<Integer>();
			arr[i] = a[i];
		}
		if(sum != 0) {
			return -1;
		}
		for(int i = 0; i < edges.length; i++) {
			node[edges[i][0]].add(edges[i][1]);		
			node[edges[i][1]].add(edges[i][0]);		
		}
		dfs(0);
		
		
		return answer;
    }

	private long dfs(int start) {
		visited[start] = true;
		
		for(int i = 0 ; i < node[start].size(); i++) {
			int next = node[start].get(i);
			if(!visited[next]) {
				arr[start] += dfs(next);
			}
		}
		this.answer += Math.abs(arr[start]);
		return arr[start];
	}

}

