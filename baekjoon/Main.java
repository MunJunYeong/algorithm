import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int count =0 ;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
		for(int i =0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for(int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}
	}



	

	
	
	
}