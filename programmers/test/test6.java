package test;

// 60057 문자열 압축
public class test6 {
    public int solution(String s) {
        int answer = s.length();
        
        for(int i = 1; i <= s.length()/2; i++) {
        	String target = s.substring(0, i);
        	int cnt = 1;
        	StringBuilder sb = new StringBuilder();
        	for(int start = i; start <= s.length(); start+=i) {
        		String next = s.substring(start, start+i >= s.length() ? s.length() : start +i);
        		if(target.equals(next)) cnt++;
        		else {
        			sb.append((cnt != 1 ? cnt : "") + target);
        			target = next;
        			cnt = 1;
        		}
        	}
        	sb.append(target);
        	answer = Math.min(answer, sb.length());
        }
        
        
        return answer;
    }
	
}