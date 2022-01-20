package greedy_one;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a4 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int [][] arr =new int[num][2];
		for(int i = 0; i < num ; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (o1, o2) -> {
			if(o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}else {
				return o1[1]  - o2[1];
			}
		});
		
		int cnt = 0;
		int prevEnd = 0;
		for(int i = 0; i < num; i++) {
			if(prevEnd <= arr[i][0]) {
				prevEnd = arr[i][1];
				cnt ++;
			}
		}
		System.out.println(cnt);
		
		
	}
}

