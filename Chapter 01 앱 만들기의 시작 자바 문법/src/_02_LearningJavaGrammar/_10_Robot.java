package _02_LearningJavaGrammar;

abstract class _10_Robot {	// 추상 클래스 앞에는 abstract를 붙인다.
		
	int x, y;
	int power;
	int price;
	String name;
		
	abstract void mySituation();	// 추상 메소드는 반드시 마지막에 세미콜론(;)을 써야 한다.
		
}
	
class _10_FishRobot extends _10_Robot {
	
	int depth;
	
	void mySituation() {
		
		System.out.println("나의 위치는 X좌표 : " + x + " Y좌표 : " + y + "입니다.");
		
	}
	
}