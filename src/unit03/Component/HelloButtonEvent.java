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
		
		btnY = new JButton("노란색");
		btnP = new JButton("핑크색");
		
		p.add(btnY);
		p.add(btnP);
		
		//버튼에 리스너를 달아주자
		btnY.addActionListener(this);
		btnP.addActionListener(this);
		
		//프래임기본새팅
		setTitle("버튼이밴트");
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
		JOptionPane.showMessageDialog(null, e.getActionCommand()+"버튼이 클릭되었습니다");
		if (e.getSource() ==btnP)
			p.setBackground(Color.PINK);
		JOptionPane.showMessageDialog(null, e.getActionCommand()+"버튼이 클릭되었습니다");
		
	}

	
	
}
