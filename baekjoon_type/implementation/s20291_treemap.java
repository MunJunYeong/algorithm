package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class s20291_treemap {
	
	static int n;
	static String [] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new TreeMap<>();
		
		for(int i = 0 ; i < n; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ".");
			st.nextToken();
			String exe = st.nextToken();
			if(map.containsKey(exe)) {
				int temp = map.get(exe);
				map.replace(exe, ++temp);
			}else {
				map.put(exe, 1);
			}
		}
		
		for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
		
		
	}
}

	
	

