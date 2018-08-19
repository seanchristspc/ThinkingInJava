package com.sean.unit22;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.sean.unit17.Countries;

import static com.sean.unit22.SwingConsole.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;


public class TextArea extends JFrame {
	private JButton b=new JButton("Add Data"),
			c=new JButton("Clear Data");
	private JTextArea t=new JTextArea(20,40);
	private Map<String, String> m=new HashMap<String, String>();
	public TextArea() {
		// TODO Auto-generated constructor stub
		//Use up all the data
		m.putAll(Countries.capitals());
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(Map.Entry me: m.entrySet())
					t.append(me.getKey()+": "+me.getValue()+"\n");
			}
		});
		c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				t.setText("");
			}
		});
		setLayout(new FlowLayout());
		add(new JScrollPane(t));
		add(b);
		add(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new TextArea(),475,425);
	}

}
