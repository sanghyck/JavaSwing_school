package LayoutExam;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class LayoutTest extends JFrame{
	LayoutTest(){
		
		setLayout(new GridLayout(0,1));
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(0,2));
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		
		p1.setLayout(new GridLayout(0,2));
		JButton btn1= new JButton("버튼1");
		JButton btn2= new JButton("버튼2");
		JButton btn3= new JButton("버튼3");
		JButton btn4= new JButton("버튼4");
		JButton btn5= new JButton("버튼5");
		JButton btn6= new JButton("버튼6");
		JButton btn7= new JButton("버튼7");
		
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p2.add(btn5);
		p2.add(btn6);
		p2.add(btn7);
		add(p1);
		add(p2);
		//프레임기본세팅
		setTitle("레이아웃 섞기");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new LayoutTest();

	}

}
