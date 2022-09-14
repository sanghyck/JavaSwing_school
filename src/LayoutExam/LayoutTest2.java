package LayoutExam;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.*;

import javax.swing.*;

public class LayoutTest2 extends JFrame{
	LayoutTest2(){
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout());
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		JButton b3 = new JButton("버튼3");
		JButton b4 = new JButton("버튼4");
		JButton b5 = new JButton("버튼5");
		JButton b6 = new JButton("버튼6");
		
		
		p1.add(b1);
		p1.add(b2);
		p2.add(b3);
		p2.add(b4);
		p3.add(b5);
		p3.add(b6);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		//프레임기본세팅
				setTitle("레이아웃 섞기");
				setSize(400,300);
				setLocationRelativeTo(null);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setVisible(true);
	}
	public static void main(String[] args) {
		new LayoutTest2();

	}

}
