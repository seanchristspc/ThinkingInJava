package com.sean.unit22;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import static com.sean.unit22.SwingConsole.*;
public class BorderLayout1 extends JFrame {
	
	public BorderLayout1(){
		add(BorderLayout.NORTH,new JButton("North"));
		add(BorderLayout.SOUTH,new JButton("South"));
		add(BorderLayout.EAST,new JButton("EAST"));
		add(BorderLayout.WEST,new JButton("West"));
		add(BorderLayout.CENTER,new JButton("Center"));
	}

	public static void main(String[] args) {
		run(new BorderLayout1(),300,250);
	}

}
