package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B1931 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int arr[][] = new int[num][2];
		for(int i= 0; i < num; i++) {
			String s = br.readLine();
			StringTokenizer st =new StringTokenizer(s);
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0]-o2[0];
				}
				return o1[1]-o2[1];
			}
		});
		int count = 0;
		int prevEnd = 0;
		for(int i =0; i < num; i ++) {
			if(prevEnd <= arr[i][0]) {
				prevEnd = arr[i][1];
				count ++;
			}
		}
		System.out.println(count);
		
	}
}
