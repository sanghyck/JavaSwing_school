package LayoutExam;

import java.awt.*;

import javax.swing.*;

public class HelloBorderLayout extends JFrame {
	HelloBorderLayout(){
		//�гθ���� 
		JPanel p = new JPanel();
		add(p);
		
		JButton btn1=new JButton("��ư1");
		JButton btn2=new JButton("��ư2");
		JButton btn3=new JButton("��ư3");
		JButton btn4=new JButton("��ư4");
		JButton btn5=new JButton("��ư5");
		
		p.setLayout(new BorderLayout());
		p.add(btn1,BorderLayout.NORTH);
		p.add(btn2,BorderLayout.SOUTH);
		p.add(btn3,BorderLayout.CENTER);
		p.add(btn4,BorderLayout.WEST);
		p.add(btn5,BorderLayout.EAST);
	
		
		//�����ӱ⺻����
		setTitle("���� ���̾ƿ�");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new HelloBorderLayout();

	}

}
