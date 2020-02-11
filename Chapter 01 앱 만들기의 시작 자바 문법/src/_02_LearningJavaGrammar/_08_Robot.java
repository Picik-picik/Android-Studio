package _02_LearningJavaGrammar;

public class _08_Robot {

	int x, y;
	int power;
	int price;
	String name;
	
	_08_Robot() {
		
		System.out.println("나는 조상 로봇입니다.");
		
	}
	
}

class _08_FishRobot extends _08_Robot {
	
	int depth;
	
	_08_FishRobot() {
		
		/* 
		자식 클래스의 객체가 생성될 때 자식 생성자에서 부모 생성자를 명시적으로 호출을
		하지 않는 경우, 자동으로 매개 변수가 없는 조상 생성자가 호출된다.
		즉, 이 사각형 안에는 super(); 구문이 있는 것과 동일하다.
		*/
		System.out.println("나는 자식 로봇입니다.");
		
	}
	
}