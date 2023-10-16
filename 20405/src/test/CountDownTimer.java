package test;

import javax.swing.JLabel;

public class CountDownTimer implements Runnable{
	JLabel timerLabel;
	CountDownTimer(
			JLabel timerLabel){
		this.timerLabel=timerLabel;
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			String strn= timerLabel.getText().trim();
			if(strn.equals("0")) 
				break;
			
			n= Integer.parseInt(strn)-1;
			timerLabel.setText(Integer.toString(n));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
		
		
	}
	

}
