package _04_LearningJavaGrammar;

class _06_Robot {

	int price;
	
}
public class _06_ParameterTest {
		
	public static void main(String[] args) {
			
		_06_Robot r = new _06_Robot();
			
		System.out.println(r.price);
			
		r.price = 10000;
			
		changeName(r);
			
		System.out.println(r.price);
		
	}

	static void changeName(_06_Robot r) {
		
		r.price = 20000;
		System.out.println(r.price);
		
	}
		
}