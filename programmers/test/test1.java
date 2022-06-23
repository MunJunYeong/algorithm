package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//배민 문제
public class test1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] infos = { "kim password", "lee abc" };
		String[] actions = {
				"ADD 30", 
				"LOGIN kim abc", 
				"LOGIN lee password", 
				"LOGIN kim password",
				"LOGIN kim password",
				"LOGIN lee abc",
				"ADD 30", 
				"ORDER", 
				"ORDER", 
				"ADD 40",
				"ADD 50" };
		boolean[] res = solution(infos, actions);
		for (boolean temp : res) {
			System.out.println(temp);
		}
	}

	private static boolean[] solution(String[] infos, String[] actions) {
		boolean res[] = new boolean[actions.length];
		List<User> userList = new ArrayList<User>();
		for(int i = 0 ; i < infos.length; i++) {
			StringTokenizer userSt = new StringTokenizer(infos[i]);
			userList.add(new User(userSt.nextToken(), userSt.nextToken()));
		}
		
		User user = null;
		
		for(int i = 0; i < actions.length; i++) {
			String action = actions[i];
			StringTokenizer st = new StringTokenizer(action);
			String command = st.nextToken();
			boolean temp = false;
			switch (command) {
			case "LOGIN": 
				if(user != null) break;
				String id = st.nextToken();
				String pw = st.nextToken();
				for(int j = 0; j < userList.size(); j++) {
					User tempUser = userList.get(j);
					if(tempUser.id.equals(id)) {
						if(tempUser.pw.equals(pw)) {
							user = tempUser;
							temp = true;
							break;
						}
					}
				}
				break;
			case "ADD" :
				if(user == null) break; //로그인 안된 경우
				String foodId = st.nextToken();
				user.addFood(foodId);
				temp = true;
				break;
			case "ORDER" : 
				if(user == null) break; //로그인 안된 경우
				if(!user.checkBasket()) break; //장바구니가 비워져 있을 경우
				user.clearBasket();
				temp = true;
				break;
			
			}
			res[i] = temp;
		}
		return res;
	}
}

class User {
	String id;
	String pw;
	List<String> basket = new ArrayList<String>();
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	public void clearBasket() {
		this.basket.clear();
	}
	void addFood(String foodId) {
		basket.add(foodId);
	}
	boolean checkBasket() {
		if(basket.size() == 0) {
			return false;
		}else {
			return true;
		}
	}

}