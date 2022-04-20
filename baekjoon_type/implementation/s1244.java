package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


class Student {
	int sex;
	int haveLight;
	public Student(int s, int h) {
		this.sex= s;
		this.haveLight = h;
	}
}


public class s1244 {
	
	static int n;
	static int stuNo;
	static int light[];
	static ArrayList<Student> stuArr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		stuArr = new ArrayList<Student>();
		n = Integer.parseInt(br.readLine());
		light = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i < n+1; i ++) {
			light[i] = Integer.parseInt(st.nextToken());
		}
		
		stuNo = Integer.parseInt(br.readLine());
		
		for(int i = 0;i <stuNo;i ++) {
			st = new StringTokenizer(br.readLine());
			int sex = Integer.parseInt(st.nextToken());
			int haveLight = Integer.parseInt(st.nextToken());
			stuArr.add(new Student(sex, haveLight));
		}
		
		for(int i = 0; i <stuArr.size(); i++) {
			Student tempStudent =stuArr.get(i);
			if(tempStudent.sex == 1) { //남학
				int r = tempStudent.haveLight;
				for(int a = r; a < n+1; a += r) {
					light[a] = light[a] == 0 ? 1:0;
				}
				
			}else { //여학생 
				int r = tempStudent.haveLight;
				
				if(r == 1 || r == n || light[r-1] != light[r+1]) {
					light[r] = light[r] == 0 ? 1:0;
				}else {
					int il = r-1; 
					int ir = r+1;
					light[r] = light[r] == 0 ? 1:0;
					while(il > 0 && ir <=n) {
						if(light[il] == light[ir]) {
							light[il] = light[il] == 0 ? 1:0;
							light[ir] = light[ir] == 0 ? 1:0;
							il--;
							ir++;
						}else {
							break;
						}
					}
				}
			}
		}
		for(int i = 1; i < n+1; i++) {
			System.out.print(light[i] + " ");
			if((i)%20 == 0) {
				System.out.println();
			}
		}
		
		
		
	}
}

	
	


