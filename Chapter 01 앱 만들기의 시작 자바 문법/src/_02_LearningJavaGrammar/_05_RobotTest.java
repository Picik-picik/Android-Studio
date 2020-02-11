package _02_LearningJavaGrammar;

public class _05_RobotTest {

	public static void main(String[] args) {
		
		_04_Robot r1 = new _04_Robot();
		_04_FishRobot fish1 = new _04_FishRobot();
		
		r1.mySituation();
		
		fish1.x = 100;
		fish1.y = 300;
		fish1.depth = 500;
		fish1.mySituation();
		
	}

}