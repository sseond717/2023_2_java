package s0828;

import java.util.HashMap;

public class HashMapExam {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		
		map.put("유재석", 10);
		map.put("박명수", 5);
		map.put("김종국", 3);
		
		System.out.println(map);
		
		System.out.println("총학생수 : " + map.size());
		
		System.out.println(map.get("유재석"));
		System.out.println("+++++++++++++++++++++");
		
		//\map.remove("유재석");
		map.remove("유재석", 5);
		
		System.out.println("유재석의점수 : " + map.get("유재석"));
		System.out.println("박명수의점수 : " + map.get("박명수"));
		System.out.println("김종국의점수 : " + map.get("김종국"));
		
		System.out.println("+++++++++++++++++++++");
		
		if(map.containsKey("서장훈")) {
			int point = map.get("서장훈");
			map.put("서장훈", ++point);
			System.out.println("서장훈의점수 : " + map.get("서장훈"));
			map.get("서장훈");
		}else {
			map.put("서장훈", 1);
			System.out.println("새로들어온서장훈점수1");
		}
		
		for (String key : map.keySet()) {
			System.out.println("고갱넴이름: " + key + " 포인트 : " + map.get(key));
		}
	}
}
  
