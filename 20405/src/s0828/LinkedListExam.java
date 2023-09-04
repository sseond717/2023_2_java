package s0828;

import java.util.LinkedList;

public class LinkedListExam {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println("++++++++++++++++++++");
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println("++++++++++++++++++++");
		
		list.addFirst("서장훈");
		list.addLast("서장훈");
		list.add(1, "김영철");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("++++++++++++++++++++");
		
 		System.out.println("남은학생수(제외전) : " + list.size());
		list.size();
		list.remove(list.size()-1);
		System.out.println("남은학생수(제외후) : " + list.size());
		
		list.removeFirst();
		list.removeLast();

		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("++++++++++++++++++++");
		list.set(0, "이수근");
		System.out.println(list.get(0));
		
		System.out.println(list.indexOf("김종국"));
		if(list.contains("김종국"))
			System.out.println("김종국이있습니다");
		else
			System.out.println("김종국이없습니다");
		
		System.out.println("++++++++++++++++++++");
		
		list.clear();
		

		
		
	}
} 
