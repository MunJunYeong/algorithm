
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
	int data;
	Node left;
	Node right;
	
	Node(int c ){
		this.data = c;
	}
}

class Tree {
	Node root;
	public Tree(int r) {
		this.root = new Node(r);
	}

	public void createNode(int r, int newNode) {
		System.out.println(root.left.data);
		System.out.println(root.right.data);
		if(root.data == r) {
			if(root.left == null) {
				root.left = new Node(newNode);
			}else if(root.right == null) {
				root.right = new Node(newNode);
			}
		}
		else {
			findRoot(root, r, newNode);
		}
	}

	private void findRoot(Node root, int r, int data) {
//		System.out.println(root.data + " " + r);
		if(root == null) return;
		if(root.data == r) {
			if(root.right == null) {
				root.right = new Node(data);
			}
			if(root.left == null) {
				root.left = new Node(data);
			}
		}else {
			if(root.left !=null) findRoot(root.left, r, data);
			if(root.right!=null) findRoot(root.right, r, data);
		}
		
	}

	public void findPar(Node root2, int i) {
		if(root2.left.data == i || root2.right.data == i) {
			System.out.println(root2.data);
		}else {
			if(root2.left !=null)findPar(root2.left, i);
			if(root2.right!=null) findPar(root2.right, i);
		}
	}
}

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n+1];
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = 0;
		}
		Tree tree = new Tree(1);
		arr[1] = 1;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); //1
			int b= Integer.parseInt(st.nextToken()); // 6
			if(arr[a]  == 0) { // 왼쪽이 새로 추가해야하는 부
				
				arr[a] = 1;
				tree.createNode(b, a);
			}else {
				arr[b] = 1;
				tree.createNode(a, b);
			}
			
		}
		System.out.println("fafdas");
		for(int i =2; i <=n; i++) {
			System.out.println("afdsfa");
			tree.findPar(tree.root, i);
		}
		
	}

	
}

