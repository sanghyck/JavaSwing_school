package LayoutExam;

import javax.swing.*;

public class HelloAbsLayout extends JFrame {
	HelloAbsLayout(){
		
		setLayout(null);
		
		JButton btn1 = new JButton("��ư1");
		btn1.setSize(70,40);
		btn1.setLocation(10,30);
		
		JButton btn2 = new JButton("��ư2");
		btn2.setSize(90,20);
		btn2.setLocation(150,90);
		
		add(btn1);
		add(btn2);
		
		//�����ӱ⺻����
		setTitle("��ġ�����ڰ� ���� ���밪 ���̾ƿ�");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new HelloAbsLayout();

	}

}
