package swingTalk;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.security.Provider.Service;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;


public class SelectRGB extends JDialog implements ActionListener, AdjustmentListener{
	JScrollBar rs, gs, bs;
	JLabel lar, lag, lab, sample;
	JButton bnOK, bnNo;
	boolean changeColor = false;
	
	SelectRGB(){
		setTitle("RGB값을 조절하여 배경색을 선택하세요");
		setBounds(1000, 0, 500, 250);
		setModal(true);
		
		JPanel p0 = new JPanel(null); add(p0);
		
		rs = new JScrollBar(JScrollBar.HORIZONTAL, 127,1,0,256);
		gs = new JScrollBar(JScrollBar.HORIZONTAL, 127,1,0,256);
		bs = new JScrollBar(JScrollBar.HORIZONTAL, 127,1,0,256);
		rs.setBounds(10, 40, 300, 20); p0.add(rs);
		gs.setBounds(10, 70, 300, 20); p0.add(gs);
		bs.setBounds(10, 100, 300, 20); p0.add(bs);
		
		lar = new JLabel("RED");
		lag = new JLabel("GREEN");
		lab = new JLabel("BLUE");
		lar.setBounds(320, 40, 50, 20); p0.add(lar);
		lag.setBounds(320, 70, 50, 20);	p0.add(lag);
		lab.setBounds(320, 100, 50, 20); p0.add(lab);
		
		sample = new JLabel("SAMPLE");
		sample.setOpaque(true);
		sample.setBounds(400, 40, 80, 80);
		sample.setBackground(Color.BLACK);
		p0.add(sample);
		
		bnOK = new JButton("확인");
		bnNo = new JButton("취소");
		bnOK.setBounds(300, 150, 80, 20);
		bnNo.setBounds(400, 150, 80, 20);
		p0.add(bnOK);
		p0.add(bnNo);
		
		bnOK.addActionListener(this);
		bnNo.addActionListener(this);
		rs.addAdjustmentListener(this);
		gs.addAdjustmentListener(this);
		bs.addAdjustmentListener(this);
		
		setVisible(true);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		if(e.getSource() == rs) {
			lar.setText(Integer.toString(rs.getValue()));
		}else if (e.getSource() == gs) {
			lag.setText(Integer.toString(gs.getValue()));
		}else if (e.getSource() == bs) {
			lab.setText(Integer.toString(bs.getValue()));
		}
		Color color = new Color(rs.getValue(), gs.getValue() ,bs.getValue());
		sample.setBackground(color);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bnOK) {
			changeColor = true;
			setVisible(false);
		}else if (e.getSource() == bnNo) {
			changeColor = false;
			setVisible(false);
		}
	}
}
