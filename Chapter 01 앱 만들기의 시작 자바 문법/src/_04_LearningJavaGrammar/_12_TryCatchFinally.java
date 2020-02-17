package _04_LearningJavaGrammar;

public class _12_TryCatchFinally {

	public static void main(String[] args) {
		
		int a = 10;
		int result = 0;
		
		try {
			
			result = 10 / 0;
			
		} catch (ArithmeticException e) {
			
			System.out.println("오류 이유 : " + e.getMessage());
			System.out.println("0으로 나누면 안됩니다.");
			
		} finally {
			
			System.out.println("Finish");
			
		}
		
	}

}
