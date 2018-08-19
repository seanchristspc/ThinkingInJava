package com.sean.unit22;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static com.sean.unit22.SwingConsole.*;
public class TrackEvent extends JFrame {
	private HashMap<String, JTextField> h=
			new HashMap<String, JTextField>();
	
	private String[] event={"focusGained","focusLost","keyPressed","keyReleased",
			"keyTyped","mouseClicked","mouseEntered","mouseExited","mousePressed",
			"mouseReleased","mouseDragged","mouseMoved"};
	
	private MyButton b1=new MyButton(Color.blue, "test1"),
			b2=new MyButton(Color.RED, "test2");
	
	class MyButton extends JButton{
		void report(String field,String msg){
			h.get(field).setText(msg);
		}
		FocusListener fl=new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				report("focusLost", e.paramString());
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				report("focusGained", e.paramString());
			}
		};
		
		KeyListener kl=new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				report("keyTyped", e.paramString());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				report("keyReleased", e.paramString());
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				report("keyPressed", e.paramString());
			}
		};
	
		MouseListener ml=new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mouseReleased", e.paramString());
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mousePressed", e.paramString());
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mouseExited", e.paramString());
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mouseEntered", e.paramString());
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mouseClicked", e.paramString());
			}
		};
		
		MouseMotionListener mml=new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mouseMoved", e.paramString());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mouseDragged", e.paramString());
			}
		};
		
		public MyButton(Color color,String label){
			super(label);
			setBackground(color);
			addFocusListener(fl);
			addKeyListener(kl);
			addMouseListener(ml);
			addMouseMotionListener(mml);
		}
	
	}
	
	public TrackEvent() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(event.length+1,2));
		for(String evt:event){
			JTextField t=new JTextField();
			t.setEditable(false);
			add(new JLabel(evt,JLabel.RIGHT));
			add(t);
			h.put(evt, t);
		}
		add(b1);
		add(b2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new TrackEvent(), 700, 500);
	}

}
