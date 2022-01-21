package bruce;


public class a4 {
	static boolean[] arr = new boolean[10001];
	public static void main(String[] args) {
		for(int i = 1; i < 10001; i++) {
			int n = self(i);
			if(n < 10001) {
				arr[n] = true;
			}
		}
		for(int i  = 1; i < arr.length; i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
	}
	private static int self(int i) {
		int sum = i;
		while(i != 0) {
			sum = sum + (i%10);
			i = i/10;
		}
		return sum;
	}
}
