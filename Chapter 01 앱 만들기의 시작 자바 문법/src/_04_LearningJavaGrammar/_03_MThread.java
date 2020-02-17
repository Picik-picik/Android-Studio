package _04_LearningJavaGrammar;

class Thread1 extends Thread {		// 사용자가 만든 Thread
	
	public void run() {
		
		for (int i = 0; i < 1000; i++)
			System.out.println("Thread1" + i + " ");
		
	}
	
}

public class _03_MThread {
	
	public static void main(String[] args) {	// main Thread(메인 쓰레드)
		
		Thread1 t = new Thread1();
		
		t.start();
		
		for (int i = 0; i < 1000; i++)
			System.out.println("mainT" + i + " ");
		
	}
	
}