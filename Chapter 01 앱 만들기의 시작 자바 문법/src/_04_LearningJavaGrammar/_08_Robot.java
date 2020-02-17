package _04_LearningJavaGrammar;

class _08_Robot {

	int x, y;
	private int power;
	int price;
	String name;
	
	void mySituation() {
		
		System.out.println("나의 위치는 " + x + " , " + y + "입니다.");
		System.out.println(x);
		
	}
	
}

class _08_FishRobot extends _08_Robot {
	
	int depth;
	
	void swim() {
		
		price = 1000;
		// power = 2000;
		// 오류 발생. 조상 멤버 변수 price는 사용할 수 있지만 private으로 선언된 power은 사용할 수 없다.
		System.out.println("저의 가격은 " + price + "입니다.");
		// System.out.println("저의 power는 " + power + "입니다.");	// 오류 발생
		
	}
	
}