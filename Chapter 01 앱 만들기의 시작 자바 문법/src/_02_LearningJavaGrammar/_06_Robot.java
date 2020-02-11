package _02_LearningJavaGrammar;

public class _06_Robot {

	int x, y;
	int power;
	int price;
	String name;
	
	_06_Robot(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void mySituation() {
		
		System.out.println("나의 위치는 " + x + ", " + y + "입니다.");
		System.out.println(x);
		
	}
	
}

class _06_FishRobot extends _06_Robot {
	
	int depth;
	
	_06_FishRobot(int x, int y) {
		
		super(x, y);	// 조상의 생성자를 호출한다. 생성자의 호출 순서는 부모 생성자가 먼저이고, 다음에 자식 생성자가 호출된다.
	
	}
	
	void swim() {
		
		System.out.println("저는 지금 수심 " + depth + "m에 있습니다.");
		
	}
	
}

class _06_DroneRobot extends _06_Robot {
	
	int altitude;	// 고도
	
	_06_DroneRobot(int x, int y) {
		
		super(x, y);
		
	}
	
	void fly() {
		
		System.out.println("저는 지금 높이 " + altitude + "m에 있습니다.");
		
	}
	
}
