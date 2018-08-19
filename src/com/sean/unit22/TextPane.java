package com.sean.unit22;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import static com.sean.unit22.SwingConsole.*;


public class TextPane extends JFrame{
	private JButton b=new JButton("Add text");
	private JTextPane tp=new JTextPane();
	public TextPane() {
		// TODO Auto-generated constructor stub
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++)
					tp.setText("hahahhhhahcvaj"+"\n");
			}
		});
		add(new JScrollPane(tp));
		add(BorderLayout.SOUTH,b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new TextPane(), 475,425);
	}

}
