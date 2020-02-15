package _03_LearningJavaGrammar;

public class _06_Robot {

	int x, y;
	int price;
	
	_06_Robot(int price) {
		
		this.price = price;
		
	}
	
	void mySituation() {
		
		System.out.println("조상 클래스 : 나의 위치는 " + x + ", " + y + "입니다.");
		
	}
	
}

class _06_FishRobot extends _06_Robot {
	
	_06_FishRobot(int price) {
		
		super(price);
		
	}
	
	int depth;
	
	void swim() {
		
		System.out.println("나의 수심은 " + depth + "입니다.");
		
	}
	
}

class _06_DroneRobot extends _06_Robot {
	
	_06_DroneRobot(int price) {
		
		super(price);
		
	}
	
	int altitude;	// 고도
	
	void fly() {
		
		System.out.println("저는 지금 높이 " + altitude + "m에 있습니다.");
		
	}
	
}

class _06_TankRobot extends _06_Robot {
	
	_06_TankRobot(int price) {
		super(price);
		
	}
	
	int speed;		// 속도
	
	void goForward() {
		
		System.out.println("저는 지금 속도가 " + speed + "입니다.");
		
	}
	
}

class Purchaser_1 {
	
	int money = 200000;
	
	void purchase(_06_FishRobot f) {
		
		money -= f.price;
		
	}
	
	void purchase(_06_DroneRobot d) {
		
		money -= d.price;
		
	}
	
	void purchase(_06_TankRobot t) {
		
		money -= t.price;
		
	}
	
}

class Purchaser_2 {
	
	int money = 200000;
	
	void purchase(_06_Robot r) {
		
		money -= r.price;
		
	}
	
}