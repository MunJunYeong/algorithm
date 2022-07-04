package graph;


public class graph43162 {
	
	boolean [] check;
	
	public int solution(int n, int[][] computers) {
        int answer = 0;
        check = new boolean[n+1];
        
        for(int i = 0; i < computers.length; i++) {
        	if(!check[i]) {
        		answer++;
        		dfs(i, computers);
        	}
        }
        return answer;
    }

	private void dfs(int node, int[][] computers) {
		check[node] = true;
		for(int i = 0; i < computers.length;i ++) {
			if(!check[i] && computers[i][node] == 1) {
				dfs(i, computers);
			}
		}
	}
}