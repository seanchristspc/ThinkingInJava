package com.sean.unit22;

import javax.swing.JButton;
import javax.swing.JFrame;
import static com.sean.unit22.SwingConsole.*;

import java.awt.GridLayout;

public class GridLayout1 extends JFrame {
	
	public GridLayout1(){
		setLayout(new GridLayout(7,3));
		for(int i=0;i<21;i++)
			add(new JButton("Button"+i));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new GridLayout1(), 300, 300);
	}

}
