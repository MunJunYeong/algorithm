package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;




public class s12933 {
	
	static String s;
	static ArrayList<Stack<Character>> dock;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		s = br.readLine();
		if( (s.length()%5) != 0 ) {
			System.out.println(-1); System.exit(0);
		}
		
		dock = new ArrayList<Stack<Character>>();
		int [] dockCnt = new int[5];
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			switch(c) {
			case 'q': 
				dockCnt[0] ++;
				if(dock.isEmpty()) {
					dock.add(new Stack<Character>());
					dock.get(0).add(c);
				}else if(!findLocation('k', c)) {
					dock.add(new Stack<Character>());
					dock.get(dock.size()-1).add(c);
				}
				break;
				
			case 'u': 
				dockCnt[1] ++;
				if(!findLocation('q', c)) {
					System.out.println(-1);
					System.exit(0);
					return;
				}
				break;
				
			case 'a': 
				dockCnt[2] ++;
				if(!findLocation('u', c)) {
					System.out.println(-1);
					System.exit(0);
					return;
					
				}
				break;
				
			case 'c': 
				dockCnt[3] ++;
				if(!findLocation('a', c)) {
					System.out.println(-1);
					System.exit(0);
					return;
					
				}
				break;
				
			case 'k': 
				dockCnt[4] ++;
				if(!findLocation('c', c)) {
					System.out.println(-1);
					System.exit(0);
					return;
					
				}
				break;
			}
		}
		int totalDock = 0;
		int qCnt = dockCnt[0];
		
		boolean flag = true;
		
		for(int i = 0; i < 5; i ++) {
			totalDock += dockCnt[i];
			if(qCnt != dockCnt[i]) {
				flag = false; break;
			}
		}
		if(totalDock % 5 != 0) {
			flag = false;
		}
		if(flag) {
			System.out.println(dock.size());
		}else {
			System.out.println(-1);
		}
	}


	private static boolean findLocation(char lascC, char c) {
		for(int i = 0; i < dock.size();i ++) {
			if(dock.get(i).peek() == lascC) {
				dock.get(i).add(c);
				return true;
			}
		}
		
		return false;
	}





}

	
	

