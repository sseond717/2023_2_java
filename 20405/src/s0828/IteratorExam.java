package s0828;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExam {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("뉴재석");
		list.add("ㅁㄴㅇㄹㅁㄴㅇㄹ");
		list.add("지석진");
		list.add("ㅁㄴㅇㄹㅁㄴㅇㄹ");
		list.add("김종국");
		list.add("ㅁㄴㅇㄹㅁㄴㅇㄹ");
		list.add("송지효");
		list.add("하하");
		
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("+++++++++++++++++++++");
		
		Iterator<String> it = list.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		
		System.out.println("++++++++++++++++++++");
		
		it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("++++++++++++++++++++");
		
		it = list.iterator();
		
		while(it.hasNext()) {
			String s= it.next();
			if(s.contains("ㅁㄴㅇㄹㅁㄴㅇㄹ")) {
				it.remove();
			}
			
		}
		System.out.println(list);
		it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("++++++++++++++++++++");
		
	}
}
   