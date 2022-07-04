package test;


// 12952
public class test4 {
	int[] arr;
	boolean [] visited;
	int cnt;
	public int solution(int n) {
        arr = new int[n];
        visited = new boolean[n];
        cnt = 0;
        
        permutation(n, 0);
        
        
        return cnt;
    }
	private void permutation(int n, int idx) {
		if(n == idx) {
			cnt++; return;
		}
		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[idx] = i;
				if(check(idx)) {
					permutation(n, idx+1);
				}
				visited[i] = false;
			}
		}
		
	}
	private boolean check(int idx) {
		for(int i = 0 ; i < idx; i++) {
			if(arr[i] == arr[idx]) return false;
			if(Math.abs(idx - i) == Math.abs(arr[idx]- arr[i]))return false;
		}
		return true;
	}
}
