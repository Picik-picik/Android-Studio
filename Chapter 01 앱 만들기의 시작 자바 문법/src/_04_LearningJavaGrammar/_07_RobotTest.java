package _04_LearningJavaGrammar;

class _07_Robot {
	   
    int x, y;
    int price = 1000;
    
    _07_Robot(int x, int y) {
    
       this.x = x;
       this.y = y;
    
    }
    
    void showMe() {
    
       System.out.println("나는 droneRobot의 조상 클래스입니다.");
    
    }
 
 }

class _07_droneRobot extends _07_Robot {
	
	int price = 100;
	
	_07_droneRobot(int x, int y) {
		
		super(x, y);	// 조상 클래스의 생성자를 호출한다.
		
	}
	
	void showMe() {
		
		System.out.println("나는 자손 클래스입니다.");
		
	}
	
	void showPrice() {
		
		System.out.println("price = " + price);
		System.out.println("super.price = " + super.price);
		super.showMe();	// 조상 클래스의 메소드를 호출한다.
		showMe();
		
	}
	
}

public class _07_RobotTest {

	public static void main(String[] args) {
		
		_07_droneRobot drone1 = new _07_droneRobot(100, 300);
		drone1.showPrice();

	}

}