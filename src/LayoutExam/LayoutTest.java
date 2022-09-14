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
		JButton btn1= new JButton("��ư1");
		JButton btn2= new JButton("��ư2");
		JButton btn3= new JButton("��ư3");
		JButton btn4= new JButton("��ư4");
		JButton btn5= new JButton("��ư5");
		JButton btn6= new JButton("��ư6");
		JButton btn7= new JButton("��ư7");
		
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p2.add(btn5);
		p2.add(btn6);
		p2.add(btn7);
		add(p1);
		add(p2);
		//�����ӱ⺻����
		setTitle("���̾ƿ� ����");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new LayoutTest();

	}

}
