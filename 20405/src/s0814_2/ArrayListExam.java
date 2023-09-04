package s0814_2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExam {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list);
		
		System.out.println("++++++++++++++++++++");
		
		System.out.println("신청학생수(삭제전) : " + list.size());
		list.remove("김종국");
		System.out.println("신청학생수(삭제후) : " + list.size());
		
		System.out.println("++++++++++++++++++++");

		System.out.println(list.get(2));
		
		System.out.println("++++++++++++++++++++");
		
		System.out.println("남은학생수(제외전) : " + list.size());
		list.remove(list.size() - 1);
		System.out.println("남은학생수(제외후) : " + list.size());
		
		System.out.println("++++++++++++++++++++");
		
		for (String s:list) {
			System.out.println(s);
		}
		
		System.out.println("++++++++++++++++++++");
		
		System.out.println("이름변경전 : " + list.get(0));
		list.set
		(0, "이수근");
		System.out.println("이름변경전 : " + list.get(0));

		System.out.println("++++++++++++++++++++");
		
		System.out.println(list.indexOf("송지효"));
		if(list.contains("송지효")) {
			System.out.println("송지효가포함되어있군요");
		}else {
			System.out.println("송지효가포함되어있지않군요");
		}
		
		System.out.println("++++++++++++++++++++");
		
		list.clear();
		
		if(list.isEmpty()) {
			System.out.println("학생 수 : " + list.size());
		}
		
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		
		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);
		}
		

	}  

}
