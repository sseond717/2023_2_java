package s0911;

import java.awt.*;

import javax.swing.*;

public class HelloPanel extends JFrame{
	HelloPanel(){
		JPanel p = new JPanel();
		p.setBackground(Color.magenta);
		add(p);
		
		JButton btn1 = new JButton("버튼");
		p.add(btn1);
		
		setTitle("안녕 스윙!");
		setSize(300, 100);
		setLocation(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	public static void main(String[] args) {
		new HelloPanel();
	}
}
