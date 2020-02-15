package _03_LearningJavaGrammar;

interface _02_Robot {	// 키워드 class 대신에 interface를 사용한다.

	abstract void mySituation();
	
}

class _02_FishRobot implements _02_Robot {	// extends 대신에 implements를 사용한다.
	
	int depth;
	int x, y;
	
		public void mySituation() {
			
			System.out.println("나의 위치는 X좌표 : " + x + " Y좌표 : " + y + "입니다.");
			// 반드시 추상 메소드를 구현해주어야 한다.
			
		}
	
}