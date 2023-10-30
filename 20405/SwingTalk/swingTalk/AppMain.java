package swingTalk;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class AppMain extends JFrame implements ActionListener{
	public static void main(String[] args) {
		new AppMain();
	}
	AppMain(){
		JPanel p = new JPanel();
		JLabel lbt = new JLabel("안녕하세요");
		JTextField tf = new JTextField("20405 김민준");
		JButton bn = new JButton("확인");
		
		add(p);
		p.setLayout(null);
		p.setBackground(new Color(254, 229, 0));
		
		ImageIcon image = new ImageIcon("img/cat.png");
		JLabel lbi = new JLabel(image);
		
		
		lbi.setBounds(75, 180, 150, 150);
		lbi.setHorizontalAlignment(JLabel.CENTER);

		lbt.setBounds(70, 270, 150, 150);
		lbt.setHorizontalAlignment(JLabel.CENTER);
		
		tf.setBounds(50, 400, 200, 30); 
		bn.setBounds(50, 440, 200, 30);
		p.add(lbi);
		p.add(lbt);
		p.add(tf);
		
		p.add(bn);
		
		bn
		.addActionListener(this);
		
		setTitle("RobotChat Login");
		setSize(320, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
