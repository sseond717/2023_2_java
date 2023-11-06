package swingTalk;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class AppMain extends JFrame implements ActionListener{
	String userID;
	JPanel p = new JPanel();
	JLabel stau = new JLabel("안녕하세요");
	JTextField tfil = new JTextField("20405 김민준");
	JButton bn = new JButton("확인");
	public AppMain(){
		
		
		add(p);
		p.setLayout(null);
		p.setBackground(new Color(254, 229, 0));
		
		ImageIcon image = new ImageIcon("img/cat.png");
		JLabel profil = new JLabel(image);
		
		profil.setBounds(75, 180, 150, 150);
		profil.setHorizontalAlignment(JLabel.CENTER);
		
		stau.setBounds(70, 270, 150, 150);
		stau.setHorizontalAlignment(JLabel.CENTER);
		
		tfil.setBounds(50, 400, 200, 30); 
		bn.setBounds(50, 440, 200, 30);
		
		p.add(profil);
		p.add(stau);
		p.add(tfil);
		p.add(bn);
		
		
		bn.addActionListener(this);
		
		setTitle("RobotChat Login");
		setSize(320, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new AppMain();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bn) {
			String userId = tfil.getText().trim();
			if(userId.length()==0) {
				JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
			}else {
				new Chat(userId);
				dispose();
			}
		}
		
	}
	
}
