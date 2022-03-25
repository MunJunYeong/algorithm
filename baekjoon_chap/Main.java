
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	static int[] dp;
	static int [][] arr;
	static int res;
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n+10][2];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		dp = new int[n+10];
		res = 0;
		for(int i =0; i <= n+1; i++) {
			dp[i]= Math.max(dp[i], res);
			dp[arr[i][0]+ i]= Math.max(dp[arr[i][0]+1], arr[i][1] + dp[i]);
			res = Math.max(dp[i], res);
		}
		System.out.println(res);
		
	}
}

	
	

