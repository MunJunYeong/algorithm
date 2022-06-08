package sort;

import java.util.Arrays;
import java.util.Comparator;

public class sort42746 {
	public String solution(int[] numbers) {
		String answer = "";
		String [] list = new String[numbers.length];
		
		for(int i = 0; i < numbers.length;i++) {
			list[i] = Integer.toString(numbers[i]);
		}
		
		Arrays.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1 + o2);
				// 오름차순 같은 경우에는 o1 + o2로 통일
			}
		});
		
		if(list[0].equals("0")) return "0";
		for(String s : list) {
			answer += s;
		}
        return answer;
    }
}
