package com.sean.unit22;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import static com.sean.unit22.SwingConsole.*;
public class Buttons extends JFrame {
	private JButton jb=new JButton("JButton");
	private BasicArrowButton up=new BasicArrowButton(BasicArrowButton.NORTH),
			down=new BasicArrowButton(BasicArrowButton.SOUTH),
			right=new BasicArrowButton(BasicArrowButton.EAST),
			left=new BasicArrowButton(BasicArrowButton.WEST);
	
	public Buttons() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		add(jb);
		add(new JToggleButton("JToggleButton"));
		add(new JCheckBox("JCheckBox"));
		add(new JRadioButton("JRadioButton"));
		JPanel jp=new JPanel();
		jp.setBorder(new TitledBorder("Directions"));
		jp.add(up);
		jp.add(down);
		jp.add(left);
		jp.add(right);
		add(jp);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new Buttons(), 350, 200);
	}

}
