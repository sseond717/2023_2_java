package s0925;


import java.awt.*;
import java.awt.event.*;
import java.util.*;                                                                               
import javax.swing.*;

public class DicApp extends JFrame implements ActionListener{
	
	private JTextField eng = new JTextField(9);
	private JTextField kor = new JTextField(9);
	private JButton saveB = new JButton("저장");
	private JButton searchB = new JButton("찾기");
	private JLabel countL = new JLabel("0");
	private JTextArea ta = new JTextArea(5, 25);
	private JScrollPane sp = new JScrollPane(ta);
	
	private HashMap<String, String> dic = new HashMap<String, String>();
	
	public DicApp(){
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		add(p);
		
		saveB.setBackground(Color.YELLOW);
		searchB.setBackground(Color.GREEN);
		
		p.add(new JLabel("영어"));
		p.add(eng);
		p.add(new JLabel("한글"));
		p.add(kor);
		p.add(saveB);
		p.add(searchB);
		p.add(countL);
		p.add(sp);
		
		saveB.addActionListener(this);
		searchB.addActionListener(this);
		
		setTitle("단어사전만들기");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new DicApp();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == saveB) {
			String eText = eng.getText();
			String kText = kor.getText();
			
			if (eText.length() == 0 || kText.length() == 0) {
				ta.append("삽입실패("+eText + ","+ kText + ")\n");
				return;
			}
			if (dic.containsKey(eText)) {
				ta.append("변경("+eText + ","+ kText + ")\n");
				dic.put(eText, kText);
			}
			else {
				ta.append("삽입("+eText + ","+ kText + ")\n");
				dic.put(eText, kText);
				
				int count = Integer.parseInt(countL.getText());
				countL.setText(Integer.toString(count+1));
			}
		}else if(e.getSource() == searchB) {
			String kText = dic.get(eng.getText());
			kor.setText(kText);
			
		}
	}
	

}
