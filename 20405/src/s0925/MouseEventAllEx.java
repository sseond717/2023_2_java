package s0925;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseEventAllEx extends JFrame implements MouseListener, MouseMotionListener{
	JLabel lb = new JLabel("MOVE ME");
	JPanel p = new JPanel();
	
	public MouseEventAllEx() {
		add(p);
		p.add(lb);
		p.setLayout(null);
		lb.setBounds(100, 80, 80, 20);
		lb.setFont(new Font("Arial", Font.PLAIN, 10));
		
		p.addMouseListener(this);
		p.addMouseMotionListener(this);
		
		setTitle("마우스 이벤트");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEventAllEx();
	
	}@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 드래그되는 동안(" + e.getX() + "," + e.getY() + " )");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 움직이는 동안(" + e.getX() + "," + e.getY() + " )");
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getClickCount() == 2) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 더블클릭되는 동안(" + e.getX() + "," + e.getY() + " )");
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
			lb.setLocation(e.getX(), e.getY());
			setTitle("마우스가 눌러진 동안(" + e.getX() + "," + e.getY() + " )");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 놓여진 위치(" + e.getX() + "," + e.getY() + " )");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		p.setBackground(Color.cyan);
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		p.setBackground(Color.yellow);
	}
	
	

}
