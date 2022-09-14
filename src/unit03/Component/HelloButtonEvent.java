package unit03.Component;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HelloButtonEvent extends JFrame implements ActionListener{
	
	JPanel p ;
	JButton btnY, btnP;
	
	HelloButtonEvent(){
		
		p = new JPanel();
		add (p);
		
		btnY = new JButton("�����");
		btnP = new JButton("��ũ��");
		
		p.add(btnY);
		p.add(btnP);
		
		//��ư�� �����ʸ� �޾�����
		btnY.addActionListener(this);
		btnP.addActionListener(this);
		
		//�����ӱ⺻����
		setTitle("��ư�̹�Ʈ");
		setSize(700,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new HelloButtonEvent();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() ==btnY)
			p.setBackground(Color.YELLOW);
		JOptionPane.showMessageDialog(null, e.getActionCommand()+"��ư�� Ŭ���Ǿ����ϴ�");
		if (e.getSource() ==btnP)
			p.setBackground(Color.PINK);
		JOptionPane.showMessageDialog(null, e.getActionCommand()+"��ư�� Ŭ���Ǿ����ϴ�");
		
	}

	
	
}
