package s0911;


import javax.swing.*;

public class HelloSwing extends JFrame{
	//ex1
//	HelloSwing(){
//		setTitle("안녕 스윙!");
//		setSize(300, 100);
//		setLocationRelativeTo(null);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		
//		setVisible(true);
//	}
//	public static void main(String[] args) {
//		new HelloSwing();
//	}
	//ex2 
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("안녕 스윙!");
		f.setLocation(500, 200);
		f.setSize(350, 100);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}
	
	//---------------------------------------- 두개 다 똑같음 
}
