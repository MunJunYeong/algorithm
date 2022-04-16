package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



class Stock {
	int cash; //현금
	int cnt; //보유
	public Stock(int cash, int cnt) {
		this.cash = cash;
		this.cnt =  cnt;
	}
	
	void buyStock(int todayCost, int cnt) {
		if(this.cash >= todayCost*cnt) {
			this.cnt += cnt;
			this.cash -= todayCost*cnt;
		}
	}
	
	void sellStock(int todayCost) {
		int res = todayCost * cnt;
		this.cnt = 0;
		this.cash += res;
	}
}

public class b20546 {
	
	static int arr[];
	static int cash;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		cash  = Integer.parseInt(br.readLine());
		arr = new int [14];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 14; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int a = findA();
		int b= findB();
		if(a > b) {
			System.out.println("BNP");
		}else if( a== b) {
			System.out.println("SAMESAME");
		}else {
			System.out.println("TIMING");
		}
	}

	private static int findB() {
		Stock s = new Stock(cash , 0);
		for(int i = 3; i < 14; i ++) {
			// 하락 장
			if(arr[i-3] > arr[i-2] && arr[i-2] > arr[i-1]) {
				int nowCash = s.cash;
				int canBuyCnt = nowCash/arr[i];
				if(canBuyCnt  > 0) {
					s.buyStock(arr[i], canBuyCnt);
				}
			}else if(arr[i-1] > arr[i-2] && arr[i-2] > arr[i-3]) {
				s.sellStock(arr[i]);
			}
		}
		return s.cash + (s.cnt*arr[13]);
	}

	private static int findA() {
		Stock s = new Stock(cash , 0);
		
		for(int todayCost : arr) {
			int nowCash = s.cash;
			int canBuyCnt = nowCash/todayCost;
			if(canBuyCnt  > 0) {
				s.buyStock(todayCost, canBuyCnt);
			}
		}
		return s.cash + (s.cnt*arr[13]);
	}

	
}

	
	

