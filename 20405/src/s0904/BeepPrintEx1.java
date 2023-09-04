package s0904;
//단일쓰레드 = main
public class BeepPrintEx1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(".");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("*");
			try {Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
