package _03_LearningJavaGrammar;

public class _07_RobotTest {

	public static void main(String[] args) {
		
		_06_FishRobot fish1 = new _06_FishRobot(50000);
		_06_DroneRobot drone1 = new _06_DroneRobot(20000);
		_06_TankRobot tank1 = new _06_TankRobot(30000);
		Purchaser_1 p1 = new Purchaser_1();
		Purchaser_2 p2 = new Purchaser_2();
		
		p1.purchase(fish1);
		p1.purchase(drone1);
		p1.purchase(tank1);
		
		p2.purchase(fish1);
		p2.purchase(drone1);
		p2.purchase(tank1);
		
		System.out.println("남아 있는 돈 : " + p1.money);
		System.out.println("남아 있는 돈 : " + p2.money);
		
	}

} 