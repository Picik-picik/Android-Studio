package _01_LearningJavaGrammar;
public class _04_Robot {

	int x, y;	// 멤버 변수
	int power;		
	int price;		
	String name;	// 문자열
	
	_04_Robot(int x, int y, int price, String name) {
		this.x = x;		// 생성자
		this.y = y;		// 로봇의 좌표 x, y와 로봇의 가격 price, 로봇의 이름을 매개변수로 받는 생성자이다.
		this.price = price;	// 여기서 참조 변수 this를 써준 것은 넘겨 받은 매개변수 x, y, price, name 값이 아니라
		this.name = name;	// 멤버 변수인 x, y, price, name을 의미한다.
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
