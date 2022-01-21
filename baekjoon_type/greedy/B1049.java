package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1049 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//6개의 줄이 패키지, 아니면 1
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int brandNum = Integer.parseInt(st.nextToken());
		// 패키지 가격 / 1개 가격
		int arr[][] = new int[brandNum][2];
		int arr2[][] = new int[brandNum][2];
 		for (int i = 0; i < brandNum; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st2.nextToken());
			int b  = Integer.parseInt(st2.nextToken());
			arr[i][0] = a;
			arr[i][1] = b;
			arr2[i][0] = a;
			arr2[i][1] = b;
		}
 		Arrays.sort(arr, (o1, o2) ->{
 			if(o1[0] == o2[0]) {
 				return o1[1] - o2[1];
 			}else
 				return o1[0] - o2[0];
 		});
 		Arrays.sort(arr2, (o1, o2) ->{
 			if(o1[1] == o2[1]) {
 				return o1[0] - o2[0];
 			}else
 				return o1[1] - o2[1];
 		});
// 		for(int i = 0 ; i < brandNum; i++) {
// 			System.out.println(arr[i][0] + ": arr : " + arr[i][1]);
// 		}
// 		for(int i = 0 ; i < brandNum; i++) {
// 			System.out.println(arr2[i][0] + ": arr2 : " + arr2[i][1]);
// 		}
 		int sum = 0 ;
 		while(true) {
 			if(num < 6) {
 				int temp  = arr[0][0];
 				int temp2 = arr2[0][1] * num;
 				if(temp > temp2) {
 					sum += temp2;
 					num = 0; break;
 				}else {
 					sum += temp;
 					num = 0; break;
 				}
 			}
 			int temp  = arr[0][0];
 			int temp2 = arr2[0][1] * 6;
 			if(temp > temp2) {
 				sum += temp2;
 				num-=6;
 			}else {
 				sum += temp;
 				num-=6;
 			}
 		}
 		System.out.println(sum);
	}
}

