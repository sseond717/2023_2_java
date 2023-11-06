package swingTalk;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Chat extends JFrame{
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItem[] = new JMenuItem[4];
	String[] menuTitle =  {"이름 변경","배경 변경", "폰트 변경", "서버주소 변경"};
	
	JPanel ptop, pbot;
	JScrollPane pchat;
	
	String userID;
	JLabel userLabel ;
	
	public Chat(String userID) {
		
		this.userID = userID;
		setSize(320, 620);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		createMenu();
		
		setVisible(true);
		
		ptop = new JPanel();
		pchat = new JScrollPane();
		pbot = new JPanel();

		ptop.setBounds(0, 0, 310, 40);	
		pchat.setBounds(0, 40, 310, 480);
		pbot.setBounds(0, 480, 310, 80);		
				
		ptop.setBackground(Color.yellow);
		pchat.setBackground(Color.pink);
		pbot.setBackground(Color.gray);

		add(ptop);
		add(pchat);
		add(pbot);
		
		draw_top_panel();
		draw_chat_panel();
		draw_bottom_panel();
		
	}private void draw_top_panel() {
		userLabel = new JLabel();
		userLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		userLabel.setBounds(0, 0, 300, 20);
		userLabel.setText(userID);
		ptop.add(userLabel);
		
	}private void draw_chat_panel() {
		
		
	}private void draw_bottom_panel() {
		
		
	}

	private void createMenu() {
		menuBar = new JMenuBar();
		menu = new JMenu("설정");
		menuBar.add(menu);
		
		menuItem = new JMenuItem[4];
		
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(menuTitle[i]);
			menu.add(menuItem[i]);
		}
		setJMenuBar(menuBar);
		
	}
}
