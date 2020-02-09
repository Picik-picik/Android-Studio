package _01_LearningJavaGrammar;
public class _09_RobotStatic {

	public static void main(String[] args) {

		_08_Robot r1 = new _08_Robot(600, 100, "짱가");
		_08_Robot r2 = new _08_Robot(1000, 200, "마징가");
		_08_Robot r3 = new _08_Robot(1000, 200, "태권브이");
		int num = _08_Robot.number;	// 정적 변수 = 클래스 변수
		System.out.println("지금까지 생산된 로봇 수 = " + num);
	}

}