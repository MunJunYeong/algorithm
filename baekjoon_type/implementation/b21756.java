package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class b21756 {
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i <= n ; i++) {
			arr.add(i);
		}
		
		while(arr.size()>=2) {
			for(int i = 0; i<arr.size();i++) {
				arr.remove(i);
			}
		}
		System.out.println(arr.get(0));
	}

}