package com.sean.unit22;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import static com.sean.unit22.SwingConsole.*;
public class SubmitSwingProgram extends JFrame {

	JLabel label;
	public SubmitSwingProgram() {
		// TODO Auto-generated constructor stub
		super("Hello Swing");
		label=new JLabel("A label");
		add(label);
	}
	
	public static void main(String[] args) throws InterruptedException {
		SubmitSwingProgram ssp=new SubmitSwingProgram();
		run(ssp, 300, 200);
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
