package com.sean.unit22;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SubmitSwingProgram extends JFrame {

	JLabel label;
	public SubmitSwingProgram() {
		// TODO Auto-generated constructor stub
		super("Hello Swing");
		label=new JLabel("A label");
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	static SubmitSwingProgram ssp;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ssp=new SubmitSwingProgram();
			}
			
		});
		TimeUnit.SECONDS.sleep(1);
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ssp.label.setText("Hey! This is different!");
			}
		});
	}

}
