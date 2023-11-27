package swingTalk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class SelectFont extends JDialog implements ListSelectionListener, ActionListener{
	String[] name = {"굴림", "굴림체", "궁서", "나눔손글씨 붓","휴먼고딕"};
	String[] style = {"보통","기울임","굷게","굵은 기울임"};
	String[] size = {"8","10","12","16", "20", "24","28","32"};
	
	JList fn = new JList(name);
	JList fst = new JList(style);
	JList fsz = new JList(size);
	
	JLabel sample = new JLabel("AaBbYyZz 한글처리");
	
	JButton bOk = new JButton("확인");
	JButton bNo = new JButton("취소");
	boolean changeFont = false;
	
	SelectFont(){
		setModal(true);
		setBounds(1000, 0, 400, 380);
		
		JPanel p0;
		p0 = new JPanel(null);
		add(p0);
		
		fn.setBounds(10, 10, 180, 160);
		fst.setBounds(200, 10, 100, 160);
		fsz.setBounds(310, 10, 60, 160);
		p0.add(fn); p0.add(fst); p0.add(fsz);
		
		fn.setSelectedIndex(0);
		fst.setSelectedIndex(0);
		fsz.setSelectedIndex(0);
		
		sample.setBounds(200, 180, 170, 100);
		Border border = BorderFactory.createLineBorder(Color.GRAY, 1);
		sample.setBorder(border);
		p0.add(sample);
		
		bOk.setBounds(200, 300, 80, 30);
		bNo.setBounds(290, 300, 80, 30);
		p0.add(bOk); p0.add(bNo);
		
		fn.addListSelectionListener(this);
		fst.addListSelectionListener(this);
		fsz.addListSelectionListener(this);
		bOk.addActionListener(this);
		bNo.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bOk)      changeFont = true;
		else if (e.getSource() == bNo) changeFont = false;
		setVisible(false);
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		String n = fn.getSelectedValue().toString();
		
		int st =0;
		if (fst.getSelectedIndex() == 0)      st = Font.PLAIN;
		else if (fst.getSelectedIndex() == 1) st = Font.ITALIC;
		else if (fst.getSelectedIndex() == 2) st = Font.BOLD;
		else if (fst.getSelectedIndex() == 3) st = Font.BOLD|Font.ITALIC;
		
		String temp = fsz.getSelectedValue().toString();
		int sz = Integer.parseInt(temp);
		
		Font font = new Font(n, st, sz);
		sample.setFont(font);
		
	}
}


