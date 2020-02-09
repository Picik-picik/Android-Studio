package _01_LearningJavaGrammar;
public class _08_Robot {

	int x, y;
	int power;
	int price;
	String name;
	int id;
	static int number = 0;	// 클래스 변수. 공유해서 사용할 수 있는 변수
	
	_08_Robot(int power, int price, String name) {
		this.power = power;
		this.price = price;
		this.name = name;
		
		number += 1;	// Robot을 생성할 때마다 number 값이 1이 증가한다.
		id = number;
	}
	
}
