package lv1;


class a17691 {
    int map[][];
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        map = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                map[i][j] = 0;
            }
        }
        checking(arr1, n);
        checking(arr2, n);
        
        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                int temp = map[i][j];
                if(temp == 0){
                    sb.append(" ");
                }else {
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
    void checking(int[] arr, int n){
        for(int i = 0; i < arr.length;i++){
            int num = arr[i];
            String binary = Integer.toBinaryString(num);
            binary = "0".repeat(n-binary.length()) + binary;
            for(int j = 0; j < binary.length(); j++){
                int value = binary.charAt(j) - '0';
                if(map[i][j] == 0){
                    map[i][j] = value;
                }
            }
        }
        
    }
}