package _02_LearningJavaGrammar;

public class _04_Robot {

	int x, y;
	int power;
	int price;
	String name;
	
	void mySituation() {
		
		System.out.println("조상 클래스 : 나의 위치는 " + x + ", " + y + "입니다.");
		
	}
	
}

class _04_FishRobot extends _04_Robot {
	
	int depth;
	
	void mySituation() {
		
		System.out.println("자손 클래스 : 나의 위치는 " + x + ", " + y + "입니다.");
		System.out.println("나의 수심은 " + depth + "입니다.");
		// 메소드 오버라이딩 : 조상 메소드 내용을 재정의해서 사용
		
	}
	
}