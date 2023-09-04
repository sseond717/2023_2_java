package s0904;

class RobotRaceStart extends Thread{
	public RobotRaceStart(String name) {
		super(name);	
	}
	@Override
	public void run() {
		for (int i = 0; i <=10; i++) {
			if (getName().equals("A")==true) {
				System.out.println(getName()+":"+i*10+"m");
			}else if (getName().equals("B")==true) {
				System.out.println("\t"+getName()+":"+i*10+"m");
			}else {
				System.out.println("\t\t"+getName()+":"+i*10+"m");
			}
			try {Thread.sleep(1000);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
public class RobotRace {
	public static void main(String[] args) {
			//Thread를 상속받은 클래스의 인스턴스 생성
		RobotRaceStart a = new RobotRaceStart("A");
		RobotRaceStart b = new RobotRaceStart("B");
		RobotRaceStart c = new RobotRaceStart("C");
		//Thread를 상속받은 클래스의 객체 시작
		a.start();//쓰레드 실행 시작
		b.start();
		c.start();		
	}
}
