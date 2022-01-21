package chap5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String [] a = new String[num];
		
		for(int i =0; i < num; i++) {
			a[i] = br.readLine();
		}
		
		for(int i =0; i < num; i++) {
			int sum= 0;
			int count = 0;
			for(int j = 0; j< a[i].length(); j++) {
				if(a[i].charAt(j) == 'O') {
					count++;
				}else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}
}
