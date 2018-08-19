package com.sean.unit22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static com.sean.unit22.SwingConsole.*;
public class Faces extends JFrame {
	
	private static Icon[] faces;
	private JButton jb,jb2=new JButton("Disable");
	private boolean mad=false;
	public Faces() {
		faces=new Icon[]{
				new ImageIcon(getClass().getResource("close-circle.png")),
				new ImageIcon(getClass().getResource("smile.png")),
				new ImageIcon(getClass().getResource("info-circle.png")),
				new ImageIcon(getClass().getResource("smile.png")),
				new ImageIcon(getClass().getResource("sync.png")),
		};
		jb=new JButton("JButton",faces[3]);
		setLayout(new FlowLayout());
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mad){
					jb.setIcon(faces[3]);
					mad=false;
				}else{
					jb.setIcon(faces[0]);
					mad=true;
				}
				jb.setVerticalAlignment(JButton.TOP);
				jb.setHorizontalAlignment(JButton.LEFT);
				
			}
		});
		jb.setRolloverEnabled(true);
		jb.setRolloverIcon(faces[1]);
		jb.setPressedIcon(faces[2]);
		jb.setDisabledIcon(faces[4]);
		jb.setToolTipText("Yom!");
		add(jb);
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(jb.isEnabled()){
					jb.setEnabled(false);
					jb2.setText("Enable");;
				}else{
					jb.setEnabled(true);
					jb2.setText("Disable");
				}
			}
		});
		jb2.setToolTipText("haahhahah");
		add(jb2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new Faces(), 250, 125);
	}

}
