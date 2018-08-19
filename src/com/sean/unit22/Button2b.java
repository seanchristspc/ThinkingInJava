package com.sean.unit22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import static com.sean.unit22.SwingConsole.*;

public class Button2b extends JFrame {
	private JButton b1=new JButton("Button 1"),b2=new JButton("Button 2");
	private JTextField txt=new JTextField(10);
	
	private ActionListener bl=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String name=((JButton)e.getSource()).getText();
			txt.setText(name);
		}
	};
	
	public Button2b() {
		// TODO Auto-generated constructor stub
		b1.addActionListener(bl);
		b2.addActionListener(bl);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(txt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			run(new Button2b(),200,150);
	}

}
