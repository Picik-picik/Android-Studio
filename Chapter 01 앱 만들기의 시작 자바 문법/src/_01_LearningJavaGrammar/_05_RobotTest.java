package _01_LearningJavaGrammar;
public class _05_RobotTest {

	public static void main(String[] args) {
		
		_04_Robot r1 = new _04_Robot(0, 0, 100, "마징가");
		_04_Robot r2 = new _04_Robot(100, 0, 100, "짱가");
		
		r1.moveRight();
		r1.showMe();
		r2.moveRight();
		r2.showMe();
		
	}

}