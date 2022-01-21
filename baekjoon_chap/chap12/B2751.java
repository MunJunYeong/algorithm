package chap12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B2751 {
	static int count =0 ;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException   {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i =0; i < num; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(arr);
		for(int value : arr) {
			sb.append(value).append("\n");
		}
		System.out.println(sb);
	}



	

	
	
	
}