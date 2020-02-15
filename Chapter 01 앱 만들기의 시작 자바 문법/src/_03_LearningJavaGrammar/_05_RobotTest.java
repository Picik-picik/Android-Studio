package _03_LearningJavaGrammar;

public class _05_RobotTest {

	public static void main(String[] args) {
		
		_04_FishRobot fish1 = new _04_FishRobot();
		_04_Robot r1 = new _04_FishRobot();
		
		r1.x = 100;
		r1.y = 300;
		// r1.depth = 500; 에러 발생
		r1.mySituation();
		// r1.swim(); 에러 발생
	}

}