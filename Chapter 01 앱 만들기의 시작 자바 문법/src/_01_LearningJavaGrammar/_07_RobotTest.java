package _01_LearningJavaGrammar;
public class _07_RobotTest {

	public static void main(String[] args) {
		
		_06_Robot r1 = new _06_Robot(0, 0, 100, "마징가");
		_06_Robot r2 = new _06_Robot(100, 0, 100, "짱가");
		_06_Robot r3 = new _06_Robot(200, 200);
		_06_Robot r4 = new _06_Robot("태권브이");
		
		r1.moveRight();
		r1.showMe();
		
		r2.moveRight();
		r2.showMe();
		
		r3.showMe();
		r4.showMe();
		
	}

}