package LayoutExam;

import javax.swing.JFrame;
public class HelloPanel extends JFrame{
	
	HelloPanel(){
		setTitle("¾È³ç ÆÐ³Î");
		setSize(300,500);
		setLayeredPane(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new HelloPanel();

	}

}
