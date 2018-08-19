package com.sean.unit22;

import javax.swing.JButton;
import javax.swing.JFrame;
import static com.sean.unit22.SwingConsole.*;

import java.awt.FlowLayout;
public class FlowLayout1 extends JFrame {
	
	public FlowLayout1() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		for(int i=0;i<20;i++)
			add(new JButton("Button"+i));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new FlowLayout1(), 300, 300);
	}

}
