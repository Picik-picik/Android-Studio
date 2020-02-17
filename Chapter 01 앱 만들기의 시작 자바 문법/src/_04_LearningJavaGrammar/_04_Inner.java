package _04_LearningJavaGrammar;

class _04_Robot {
	
	int x = 100;	// 미사일 좌표, 외부 멤버 변수
	InnerClass i1;
	
	_04_Robot() {
		
		i1 = new InnerClass();	// 내부 클래스의 메소드를 접근하기 위한 내부 클래스 객체 생성
		
	}
	
	class InnerClass {
		
		int v = x;
		/*
		외부 클래스의 멤버 변수를 참조할 수 있지만 외부 클래스의 멤버 변수의 값을 수정할 수는 없다.
		예를 들어 x = 200; 으로 하면 오류가 발생한다.
		외부 클래스의 멤버 변수의 값을 수정하려면 내부 클래스의 메소드 안에서만 가능하다.
		 */
		
		void sMissile() {
			
			System.out.println("내부 클래스 메소드를 실행했습니다.");
			System.out.println("미사일이 발사되었습니다.");
			
		}
		
		void missileLocation() {
			
			x += 10;	// 메소드 안에서 외부 멤버 변수 값 수정 가능
			System.out.println("미사일의 좌표는 " + x + "입니다.");
			System.out.println("외부 클래스 멤버변수를 변경했습니다.");
			
		}
		
		void shootMissile() {
			
			i1.sMissile();
			/*
			외부 클래스에서 내부 클래스의 멤버 메소드에 접근하기 위해서는
			내부 클래스의 객체명, 메소드 형식으로 접근해야 한다.
			 */
			
		}
		
		void moveLeft() {
			
			i1.missileLocation();
			
		}
		
	}
	
}

public class _04_Inner {

	public static void main(String[] args) {
		
		_04_Robot r1 = new _04_Robot();
		
		r1.i1.shootMissile();
		r1.i1.moveLeft();
		
	}

}