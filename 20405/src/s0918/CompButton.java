package s0918;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CompButton extends JFrame implements ActionListener{
	JButton btnY, btnP;
	JPanel p;
	
	CompButton(){
		p = new JPanel();
		add(p);
		
		btnY = new JButton("노란색");
		btnP = new JButton("핑크색");
		
		p.add(btnY);
		p.add(btnP);
		
		btnY.addActionListener(this);
		btnP.addActionListener(this);
		
		setTitle("배경색 바꾸기");
		setSize(700, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CompButton();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnY) {
				p.setBackground(Color.YELLOW);
			}else if (e.getSource() == btnP) {
				p.setBackground(Color.PINK);
			
		}
	}

}
