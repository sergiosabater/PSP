public class Numbers {

	public static void main(String[] args) {
		NumberThread n1, n2, n3, n4, n5, n6;
		
		n1 = new NumberThread(1); n1.start();
		n2 = new NumberThread(2); n2.start();
		n3 = new NumberThread(3); n3.start();
		n4 = new NumberThread(4); n4.start();
		n5 = new NumberThread(5); n5.start();
		n6 = new NumberThread(6); n6.start();
		
		Thread nr1, nr2, nr3, nr4, nr5, nr6;
		
		nr1 = new Thread(new NumberRunnable(71)); nr1.start();
		nr2 = new Thread(new NumberRunnable(72)); nr2.start();
		nr3 = new Thread(new NumberRunnable(73)); nr3.start();
		nr4 = new Thread(new NumberRunnable(74)); nr4.start();
		nr5 = new Thread(new NumberRunnable(75)); nr5.start();
		nr6 = new Thread(new NumberRunnable(76)); nr6.start();
	}

}
