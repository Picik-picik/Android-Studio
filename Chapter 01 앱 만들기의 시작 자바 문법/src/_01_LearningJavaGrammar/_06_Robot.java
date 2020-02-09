package _01_LearningJavaGrammar;
public class _06_Robot {

	int x, y;		
	int power;		
	int price;		
	String name;
	
	_06_Robot(String name) {
		this.name = name;	// Robot r4 = new Robot("태권브이");
	}
	
	public _06_Robot(int x, int y) {
		this.x = x;
		this.y = y;				// Robot r3 = new Robot(200, 200);
	}
	
	_06_Robot(int x, int y, int price, String name) {
		this.x = x;				
		this.y = y;				
		this.price = price;	// Robot r1 = new Robot(0, 0, 100, "마징가");
		this.name = name;	// Robot r2 = new Robot(100, 0, 100 "짱가");
	}
	      
	void moveRight() {
		x += 5;		// x 값을 5만큼 증가시키기, x = x + 5 와 같다.	
	}
	
	void moveLeft() {
		x -= 5;		// x 값을 5만큼 감소시키기, x = x - 5 와 같다.
	}
	
	void showMe() {
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println(x);
	}
	
}