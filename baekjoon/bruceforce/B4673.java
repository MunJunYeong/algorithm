package bruceforce;


import java.io.IOException;

public class B4673 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean [] flag = new boolean[10001];
		
		for(int i = 1; i <10001; i++) {
			int n = find(i);
			if(n < 10001) {
				flag[n] = true;
			}
		}
		for(int i = 1; i < 10001; i ++) {
			if(!flag[i]) {
				System.out.println(i);
			}
		}
		
		
	}

	private static int find(int i) {
		int sum = i;
		while(i != 0) {
			sum = sum + (i%10);
			i = i/10;
		}
		return sum;
	}

}
