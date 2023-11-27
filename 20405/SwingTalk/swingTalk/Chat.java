package swingTalk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.html.HTMLDocument;

public class Chat extends JFrame implements ActionListener {
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItem[] = new JMenuItem[4];
	String[] menuTitle = { "이름 변경", "배경 변경", "폰트 변경", "서버주소 변경" };
	JPanel ptop, pbot;
	JScrollPane pchat;
	String userID;
	JLabel userLabel;
	JTextArea txtSend;
	JButton btn_imo;
	JTextPane chatTextPane;
	HTMLDocument doc;
	
	//private HTMLMaker htmlMaker = new HTMLMaker();
	//private StringBuffer messageList = new StringBuffer();
	
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

		ptop.setBounds(0, 0, 300, 40);
		pchat.setBounds(0, 40, 300, 440);
		pbot.setBounds(0, 480, 300, 80);

		ptop.setBackground(Color.yellow);
		pchat.setBackground(Color.pink);
		pbot.setBackground(Color.gray);

		add(ptop);
		add(pchat);
		add(pbot);

		draw_top_panel();
		draw_chat_panel();
		draw_bottom_panel();
	}
	
	private void draw_top_panel() {
		userLabel = new JLabel();
		userLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		userLabel.setBounds(0, 0, 300, 20);
		userLabel.setText(userID);
		ptop.add(userLabel);
	}

	private void draw_chat_panel() {
		pchat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);;
		
		chatTextPane = new JTextPane();
		chatTextPane.setBounds(0, 0, 400, 300);
		chatTextPane.setBackground(Color.pink);
		
		chatTextPane.setContentType("text/html");
		doc = (HTMLDocument) chatTextPane.getStyledDocument();
		pchat.setViewportView(chatTextPane);
		

	}private void draw_bottom_panel() {
		pbot.setLayout(null);
		txtSend = new JTextArea();
		
		txtSend.setBounds(4, 4, 200, 70);
		txtSend.setLineWrap(true);
		
		btn_imo = new JButton("ϑ..");
		btn_imo.setBounds(220, 4, 60, 30);
		
		pbot.add(txtSend);
		pbot.add(btn_imo);
		txtSend.addKeyListener(new KeyListener(){
			@Override
			public void keyTyped(KeyEvent e) {
		
			}
			@Override
			public void keyPressed(KeyEvent e) {
		
			}
			@Override
			public void keyReleased(KeyEvent e) {
				String str = txtSend.getText().trim();
				if (e.getKeyCode() == KeyEvent.VK_ENTER && str.length() > 0) {
					System.out.println(str + "을 전송합니다.  다음에 추가구현");
				}
			}
		});
	}

	private void createMenu() {
		menuBar = new JMenuBar();
		menu = new JMenu("설정");
		menuBar.add(menu);
		menuItem = new JMenuItem[4];
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(menuTitle[i]);
			menuItem[i].addActionListener(this);
			menu.add(menuItem[i]);
		}
		setJMenuBar(menuBar);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuItem[0]) { //이름
			userID = JOptionPane.showInputDialog("새 이름을 입력하세요");
			if (userID.trim().length() != 0) {
				System.out.println("이름변경: "+ userID);
				userLabel.setText(userID);
			}
		}else if(e.getSource() == menuItem[1]) {//배경
			SelectRGB rgbDlg = new SelectRGB();
			if(rgbDlg.changeColor) chatTextPane.setBackground(rgbDlg.sample.getBackground());
		}else if(e.getSource() == menuItem[2]) {//폰트
			SelectFont fontDig =new SelectFont();
			if(fontDig.changeFont) userLabel.setFont(fontDig.sample.getFont());
			
			
		}else if(e.getSource() == menuItem[3]) {//서버주소
			
		}
		
	}
}
