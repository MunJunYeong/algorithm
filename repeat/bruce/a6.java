package bruce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int [] arr = new int[9];
		int sum = 0;
		for(int i = 0 ;  i < 9 ; i ++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		int a = 0, b= 0;
		for(int i = 0; i < arr.length-1; i ++) {
			int temp = 0;
			for(int j = i+1; j < arr.length; j++) {
				if(i == j) continue;
				temp = arr[i] + arr[j];
				if(sum - temp == 100) {
					a = arr[i];
					b = arr[j];
				}
			}
		}
		Arrays.sort(arr);
		for(int i = 0; i < 9; i ++) {
			if(arr[i] == a || arr[i] == b) {
				continue;
			}else {
				System.out.println(arr[i]);
			}
		}
		
	}
}
