package _04_LearningJavaGrammar;

class _05_Robot {

	int price;

	public static void main(String[] args) {
	
		_05_Robot r = new _05_Robot();
		// 객체생성시 멤버 변수 값들은 숫자일 경우 0, 참조형일 경우 null로 초기화된다.
		
		System.out.println(r.price);	// ①
		
		r.price = 10000;
		
		changeName(r.price);
		
		System.out.println(r.price);	// ③
	
	}

	static void changeName(int price) {
	
		price = 20000;
		System.out.println(price);	// ②
	
	}

}

/*
① Robot 객체 r을 생성하고 출력을 했다. 객체를 생성하면 객체멤버 price에 기본값이 0으로 자동
초기화 되어 출력값이 0이 나오게 된다.
② changeName() 메소드에 매개변수로 price 값 0을 넘겨 주었다. 그리고 changeName() 안에서
price 값에 20000을 넣고 출력을 하면 출력값은 20000이 나온다.
③ 메소드를 수행하고 돌아와서 생성된 객체의 price 값을 출력하면 10000이 출력된다.
기본형 매개변수는 전달되는 값이 바뀌지 않는 것을 확인 할 수 있다.
*/