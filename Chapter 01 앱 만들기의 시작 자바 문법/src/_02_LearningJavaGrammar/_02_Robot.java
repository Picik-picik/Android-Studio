package _02_LearningJavaGrammar;

public class _02_Robot {

	int x, y;
	int power;
	int price;
	String name;
	
	void mySituation() {
		
		System.out.println("나의 위치는 " + x + ", " + y + "입니다.");
		System.out.println(x);
		
	}
	
}

class _02_FishRobot extends _02_Robot {
	
	int depth;
	
	void swim() {
		
		System.out.println("저는 지금 수심 " + depth + "m에 있습니다.");
		
	}
	
}

class _02_DroneRobot extends _02_Robot {
	
	int altitude; // 고도
	
	void fly() {
		
		System.out.println("저는 지금 높이 " + altitude + "m에 있습니다.");
		
	}
	
}