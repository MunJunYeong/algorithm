package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


class Grade implements Comparable<Grade> {
	String courseName;
	int grade;
	public Grade(String n, int g) {
		this.courseName = n;
		this.grade =g;
	}
	@Override
	public int compareTo(Grade o) {
		return o.grade - this.grade;
	}
}

public class test2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] grades = {
				"DS7651 A0", 
				"CA0055 D+", 
				"AI5543 C0", 
				"OS1808 B-", 
				"DS7651 B+", 
				"AI0001 F", 
				"DB0001 B-", 
				"AI5543 D+", 
				"DS7651 A+", 
				"OS1808 B-"
		};
		String [] tempGrade= new String[grades.length];
		for(int i = 0; i < grades.length; i++) {
			StringTokenizer st =new StringTokenizer(grades[i]);
			String tempCourseName = st.nextToken();
			int n = GradeToNumber(st.nextToken());
			tempGrade[i] = tempCourseName + " " + n;
		}
		
		PriorityQueue<Grade> pq = new PriorityQueue<Grade>();
		for(int i = 0; i < tempGrade.length; i++) {
			StringTokenizer st =new StringTokenizer(tempGrade[i]);
			String tempCourseName = st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			pq.add(new Grade(tempCourseName, n));
		}
		
		List <String> temp = new ArrayList<String>();
		List <String> res = new ArrayList<String>();
		
		while(!pq.isEmpty()) {
			Grade g = pq.poll();
			boolean flag = false;
			for(int i =0 ;i <temp.size(); i++) {
				if(g.courseName.equals(temp.get(i))){
					flag = true;
				}
			}
			if(!flag) {
				res.add(g.courseName + " " + g.grade);
				temp.add(g.courseName);
			}
		}
		for(int i = 0; i < res.size();i++) {
			StringTokenizer st = new StringTokenizer(res.get(i));
			String course = st.nextToken();
			String grade = numberToGrade(Integer.parseInt(st.nextToken()));
			System.out.println(course + " " + grade);
		}
		
	}
	public static String numberToGrade(int n) {
		String temp = "F";
		switch(n) {
			case 12 :
				temp = "A+"; break;
			case 11 :
				temp = "A0"; break;
			case 10 :
				temp = "A-"; break;
			case 9 :
				temp = "B+"; break;
			case 8 :
				temp = "B0"; break;
			case 7 :
				temp = "B-"; break;
			case 6 :
				temp = "C+";break;
			case 5 :
				temp = "C0";break;
			case  4:
				temp = "C-";break;
			case  3:
				temp = "D+";break;
			case  2:
				temp = "D0"; break;
			case  1:
				temp = "D-"; break;
			case  0:
				break;
		}
		return temp;
	}
	public static int GradeToNumber(String grade) {
		int temp = 0;
		switch(grade) {
			case "A+" :
				temp = 12; break;
			case "A0" :
				temp = 11; break;
			case "A-" :
				temp = 10; break;
			case "B+" :
				temp = 9; break;
			case "B0" :
				temp = 8; break;
			case "B-" :
				temp = 7; break;
			case "C+" :
				temp = 6;break;
			case "C0" :
				temp = 5;break;
			case "C-" :
				temp = 4;break;
			case "D+" :
				temp = 3;break;
			case "D0" :
				temp = 2; break;
			case "D-" :
				temp = 1; break;
			case "F" :
				break;
		}
		return temp;
	}
}

