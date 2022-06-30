package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph49189 {
	ArrayList<Integer>[] arr;
	private int[] visited;
	private int depth = 0;
	
	@SuppressWarnings("unchecked")
	public int solution(int n, int[][] edge) {
        int answer = 0;
        visited = new int[n+1];
        arr = new ArrayList[n+1];
        for(int i = 1; i <=n; i++) {
        	arr[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < edge.length; i++) {
        	int a = edge[i][0];
        	int b = edge[i][1];
        	arr[a].add(b);
        	arr[b].add(a);
        }
        
        bfs(1, 1);
        
        for(int i = 1; i <=n;i++) {
        	if(depth == visited[i]) answer +=1;
        }
        
        return answer;
    }

	private void bfs(int start, int cnt) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		q.add(cnt);
		visited[start] = cnt;
		
		while(!q.isEmpty()) {
			int vertex = q.poll();
			int tempCnt = q.poll();
			
			if(depth < tempCnt) depth =tempCnt;
			for(int i = 0; i < arr[vertex].size(); i++) {
				int next = arr[vertex].get(i);
				if(visited[next] != 0) continue;
				visited[next] = tempCnt +1;
				q.add(next);
				q.add(tempCnt +1);
			}
			
		}
		
	}
	
}

