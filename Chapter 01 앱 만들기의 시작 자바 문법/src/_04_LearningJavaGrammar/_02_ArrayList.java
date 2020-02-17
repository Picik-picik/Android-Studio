package _04_LearningJavaGrammar;

import java.util.ArrayList;

public class _02_ArrayList {	// public으로 선언된 클래스명은 파일명과 일치해야 한다.

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		System.out.println("초기 사이즈 : " + list1.size());	// 사이즈는 0이다.
		
		list1.add("홍길동");		// 배열은 []을 사용해서 요소에 접근하지만, ArrayList에서는 ()을 사용한다.
		list1.add("세종대왕");
		list1.add("이순신");
		list1.add("강감찬");
		list1.add("을지문덕");
		
		System.out.println("지금 사이즈 : " + list1.size());
		
		for (String l : list1)
			System.out.println(l);
		
		/*
		for (int i = 0; i<list1.size(); i++)
		   System.out.println(list1.get(i));
		 */
		
		list1.remove(0);	// 홍길동 삭제
		list1.remove(1);	// 홍길동이 삭제되고 세종대왕 인덱스가 0이 되기 때문에 이순신이 삭제됨.
		
		System.out.println();	// 엔터키 효과
		System.out.println("마지막 사이즈 : " + list1.size());
		
		for (String l : list1)
			System.out.println(l);

	}

}
