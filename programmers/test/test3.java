package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;
//92334
public class test3 {
	
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashMap<String, Integer> ans = new HashMap<String, Integer>();
        for(int i =0; i < id_list.length; i++) {
        	String name = id_list[i];
        	map.put(name, new HashSet<>());
        	ans.put(name, 0);
        }
        for(int i =0; i < report.length; i++) {
        	StringTokenizer st = new StringTokenizer(report[i]);
        	String from = st.nextToken();
        	String to = st.nextToken();
        	map.get(to).add(from);
        }
        
        
        for(int i = 0; i < id_list.length;i++) {
        	String name = id_list[i];
        	HashSet<String> tempSet = map.get(name);
        	if(tempSet.size() >= k) {
        		for(String s : tempSet) {
        			ans.put(s, ans.get(s)+1);
        		}
        	}
        }
        
        for(int i = 0; i < id_list.length; i++) {
        	answer[i] = ans.get(id_list[i]);
        }
        
        
        return answer;
    }
}