package _04_LearningJavaGrammar;

class _09_Robot {
	
	private int x = 0;
	int explainOk = 1;
	int price;
	String name;
	InnerClass i1;
	
	_09_Robot() {
		
		i1 = new InnerClass();
		
	}
	
	class InnerClass {
		
		void moveAll() {
			
			System.out.println(explainOk);
			System.out.println(x);
			
		}
		
	}
	
	void moveRight() {
		
		x += 10;
		System.out.println(x);
		i1.moveAll();
		/* 
		외부 클래스에서 내부 클래스의 멤버 메소드에 접근하기 위해서는
		내부 클래스의 객체명.메소드 형식으로 사용
		*/
		
	}
	
}

public class _09_Inner {

	public static void main(String[] args) {

		_09_Robot r1 = new _09_Robot();
		
		r1.moveRight();

	}

}
