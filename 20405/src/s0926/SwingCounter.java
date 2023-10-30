package s0926;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingCounter extends JFrame implements ActionListener{
	JPanel p = new JPanel();
	JLabel lb= new JLabel("10");
	JButton bn1 = new JButton("증 가");
	JButton bn2 = new JButton("감 소");
	JButton bn3 = new JButton("초기화");
	JButton bn4 = new JButton("카운트다운");
	
	SwingCounter(){
		add(p);
		lb.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		
		p.add(bn1);
		p.add(bn2);
		p.add(bn3);
		p.add(bn4);
		p.add(lb);
		
		bn1.addActionListener(this);
		bn2.addActionListener(this);
		bn3.addActionListener(this);
		bn4.addActionListener(this);
		
		setTitle("간단 카운터");
		setSize(350, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new SwingCounter();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == bn1) {
			String str = lb.getText().trim(); 
			int cnt = Integer.parseInt(str)+1;
			str = Integer.toString(cnt);
			lb.setText(str); 
			
			
		}else if(e.getSource() == bn2) {
			String str = lb.getText().trim(); 
			int cnt = Integer.parseInt(str);
			if(cnt>0) {
				cnt-=1;
			}
			str = Integer.toString(cnt);
			lb.setText(str); 
			
		}else if(e.getSource() == bn3) {
//			String str = lb.getText().trim(); 
//			int cnt = Integer.parseInt(str)*0;
//			str = Integer.toString(cnt);
//			lb.setText(str); 그냥 복사 해서 0을 곱해도 되는데 문자열 0 으로 설정해서 넣어 하는 방법도 있음
			lb.setText("0");
			bn4.setEnabled(true);
			
			
		}else if(e.getSource() == bn4) {
			CountDownTimer runnable = new CountDownTimer(lb);
			Thread thread = new Thread(runnable);
			thread.start();
			
			bn4.setEnabled(false);
			
		}
		
	}
	
}
