package s0918;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class SwingCounter extends JFrame implements ActionListener{
	JTextField tfCounter = new JTextField("0", 5);
	JButton btnInc = new JButton("증가");
	JButton btnDec = new JButton("감소");
	JButton btnCls = new JButton("초기화");
	
	SwingCounter()	{
		JPanel p = new JPanel();
		add(p);
		
		JLabel lb = new JLabel("카운터값", JLabel.CENTER);
		
		p.add(lb);
		p.add(tfCounter);
		p.add(btnInc);
		p.add(btnDec);
		p.add(btnCls);
		
		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		
		setTitle("간단 카운터");
		setSize(400, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingCounter();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str;
		int cnt;
		if (e.getSource() == btnInc) {
			str = tfCounter.getText().trim();
			cnt = Integer.parseInt(str) + 1;
			tfCounter.setText(cnt + "");
		}else if (e.getSource() == btnDec) {
			str = tfCounter.getText().trim();
			cnt = Integer.parseInt(str) - 1;
			tfCounter.setText(cnt + "");
		}else {
			tfCounter.setText("0");
		}
		
	}
	
}
