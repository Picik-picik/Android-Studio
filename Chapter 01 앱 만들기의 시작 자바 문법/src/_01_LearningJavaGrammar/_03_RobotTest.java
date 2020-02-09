package _01_LearningJavaGrammar;
public class _03_RobotTest {

	public static void main(String[] args) {
		
		_02_Robot r1 = new _02_Robot();
		_02_Robot r2 = new _02_Robot();
		
		r1.name = "마징가";
		r1.moveRight();
		r1.showMe();
		
		r2.name = "짱가";
		r2.moveLeft();
		r2.showMe();
		
	}

}