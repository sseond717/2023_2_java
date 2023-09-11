package s0911;

import java.awt.*;
import javax.swing.*;


public class LayoutTest extends JFrame{
	public LayoutTest() {
		setLayout(null);// -> 배치관리자 = null == 배치관리자 사용하지않겠다 이런 의미 ㅇㅇ;
//		p.setBackground(Color.magenta);//		-> 색 추가 (마젠타)
//		JPanel p = new JPanel();//     ->  플로우, 그리드 
		
//		p.setLayout(new FlowLayout());//       -> 플로우 레이아웃 
		
//		p.setLayout(new GridLayout(0, 2));// new GridLayout(0, 3) 하면 모양 바뀜 ㅇㅇ  -> 그리드 레이아웃
		
		
//		JPanel p = new JPanel(new BorderLayout());//		-> 보더 

		
//		add(p);// -> 프레임에 패널을 추가;
		JButton btn1 = new JButton("버튼 1");
		JButton btn2 = new JButton("버튼 2");
		JButton btn3 = new JButton("버튼 3");
		JButton btn4 = new JButton("버튼 4");
		JButton btn5 = new JButton("버튼 5");
		JButton btn6 = new JButton("버튼 6");
		JButton btn7 = new JButton("버튼 7");
		
//		p.add(btn1);
//		p.add(btn2);
//		p.add(btn3);
//		p.add(btn4);
//		p.add(btn5);
//		p.add(btn6);
//		p.add(btn7);//    -> 플로우 그리드 
		
//		p.add(btn1, BorderLayout.NORTH);
//		p.add(btn2, BorderLayout.WEST);
//		p.add(btn3, BorderLayout.CENTER);
//		p.add(btn4, BorderLayout.EAST);
//		p.add(btn5, BorderLayout.SOUTH);//    -> 보더
		
		btn1.setSize(70, 40);
		btn1.setLocation(10, 30);
		btn2.setBounds(150, 30, 90, 20);// -> 배치관리자 없이 절대좌표를 배치(컴포넌트 크기와 위치를 지정 함) 	
		add(btn1);
		add(btn2);//		-> 절대 좌표 지정한걸 불러옴
		
		
//		setTitle("플로우 레이아웃");
	
//		setTitle("그리드 레이아웃");
		
//		setTitle("보더 레이아웃");
		
		setTitle("배치관리자 없이 배치하기");
		
		setSize(350, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new LayoutTest();
		
	}
}
