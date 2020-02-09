package _01_LearningJavaGrammar;
public class _02_Robot {
		   
	int x, y;		// 멤버 변수
	int power;		// - x, y, power, price는 정수형 int형 변수로서 정수 값을 저장할
	int price;		// 수 있는 공간(메모리)이다.
	String name;		// name 변수는 String 형태의 필드로서 문자열을 저장할 수 있는 공간(메모리)이다.
	      
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
	
	// 멤버 메소드
	// - 함수와 비슷한 용도이며 필드영역 아래 기입한다.
	// - 본 예제에서는 3개의 메소드를 만들었다.
}	