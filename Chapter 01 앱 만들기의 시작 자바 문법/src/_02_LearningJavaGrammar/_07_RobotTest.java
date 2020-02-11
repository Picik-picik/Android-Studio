package _02_LearningJavaGrammar;

public class _07_RobotTest {

	public static void main(String[] args) {
		
		_06_Robot r1 = new _06_Robot(0, 0);
		_06_FishRobot fish1 = new _06_FishRobot(100, 300);
		_06_DroneRobot drone1 = new _06_DroneRobot(100, 200);
		
		r1.mySituation();
		
		fish1.mySituation();
		fish1.depth = 500;
		fish1.swim();
		
		drone1.mySituation();
		drone1.altitude = 1500;
		drone1.fly();
		
	}

}
