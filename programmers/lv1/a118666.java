package lv1;

import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        char [] types = {'R', 'T', 'C','F','J','M','A','N'};
        HashMap<Character, Integer> index = new HashMap<>();
        for(int i = 0; i < 8; i++){
            index.put(types[i], 0);
        }
        for(int i = 0; i< survey.length; i++){
            int score = choices[i];
            if(score < 4 ){
                char c = survey[i].charAt(0);
                int temp = index.get(c);
                index.put(c, temp+4-score);
            }else if(score >4){
                char c = survey[i].charAt(1);
                int temp = index.get(c);
                index.put(c, temp+score-4);
            }
        }
        StringBuilder sb = new StringBuilder();
        char temp = index.get(types[0]) < index.get(types[1]) ? types[1] : types[0];
        sb.append(temp);
        temp = index.get(types[2]) < index.get(types[3]) ? types[3] : types[2];
        sb.append(temp);
        
        temp = index.get(types[4]) < index.get(types[5]) ? types[5] : types[4];
        sb.append(temp);
        
        temp = index.get(types[6]) < index.get(types[7]) ? types[7] : types[6];
        sb.append(temp);
        
        return sb.toString();
    }
}
