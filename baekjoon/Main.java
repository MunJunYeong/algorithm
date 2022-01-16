
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n ; i ++) {
			int num = Integer.parseInt(br.readLine());
			int [][] arr = new int[num][2];
			for(int j = 0; j < num; j ++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[j][0] = Integer.parseInt(st.nextToken());
				arr[j][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr, (o1, o2) -> {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}else {
					return o1[1] - o2[1];
					
				}
			});
			int res = 1;
			int min = arr[0][1];
			for(int j =0; j < num; j ++) {
				System.out.println(arr[j][0] + " " +  arr[j][1]);
				if(min > arr[j][1]) {
					min = arr[j][1];
					res ++;
				}
			}
//			System.out.println(res);
			
			
		}
		
		
	}
}
