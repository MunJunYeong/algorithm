package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


class Node{
	int left;
	int right;
	public Node(int left, int right) {
		this.left = left;
		this.right = right;
	}
}

public class g22856 {
	
	static int n;
	static ArrayList<Node>[] list;
	static ArrayList<Integer> inOrder;
	static int cnt = 0;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		list = new ArrayList[n+1];
		
		for(int i = 0; i <= n; i++) {
			list[i] = new ArrayList<Node>();
		}
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int root = Integer.parseInt(st.nextToken());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			list[root].add(new Node(left, right));
		}
		
		inOrder = new ArrayList<Integer>();
		dfs(1, 0, false);
		dfs(1, 0, true);
		
	}


	private static void dfs(int now, int before, boolean flag) {
		for(Node node : list[now]) {
			if(node.left != -1) {
				dfs(node.left, now, flag);
				if(flag) {
					cnt++;
				}
			}
			
			if(!flag) {
				inOrder.add(now);
			}else {
				if(inOrder.get(inOrder.size()-1) == now) {
					System.out.println(cnt); System.exit(0);
				}
				cnt++;
			}
			if(node.right != -1) {
				dfs(node.right, now, flag);
				if(flag) {
					cnt++;
				}
			}
			
		}
	}




}