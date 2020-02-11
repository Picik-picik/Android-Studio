package _02_LearningJavaGrammar;

public class _03_RobotTest {

	public static void main(String[] args) {
		
		_02_Robot r1 = new _02_Robot();
		_02_FishRobot fish1 = new _02_FishRobot();
		_02_DroneRobot drone1 = new _02_DroneRobot();
		
		r1.mySituation();
		
		fish1.x = 100;
		fish1.y = 300;
		fish1.depth = 500;
		fish1.mySituation();
		fish1.swim();
		
		drone1.x = 100;
		drone1.y = 200;
		drone1.altitude = 1500;
		drone1.mySituation();
		drone1.fly();
		
	}

}