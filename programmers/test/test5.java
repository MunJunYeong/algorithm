package test;

// 12979 기지국 설치
public class test5 {
	public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int nowStation = 1;
        int stationIdx = 0;
        
        while(nowStation <= n) {
        	// 현재 위치가 기지국 범위를 over한 경우 || 현재 위치가 기지국 범위보다 작은 경우
        	if(stationIdx >= stations.length || nowStation < stations[stationIdx] - w) {
        		answer ++;
        		nowStation += (2*w) + 1;
        	}else {
        		nowStation = stations[stationIdx] + w +1;
        		stationIdx ++;
        	}
        	
        }

        return answer;
    }
}