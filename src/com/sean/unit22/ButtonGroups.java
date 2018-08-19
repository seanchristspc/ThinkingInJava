package com.sean.unit22;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;

import static com.sean.unit22.SwingConsole.*;

import java.awt.FlowLayout;
import java.lang.reflect.Constructor;
public class ButtonGroups extends JFrame {
	private static String[] ids={"June","Ward","Beaver","Wally","Eddie","Lumpy"};
	
	static JPanel makeBPanel(Class<? extends AbstractButton> kind,String[] ids){
		ButtonGroup bg=new ButtonGroup();
		JPanel jp=new JPanel();
		String title=kind.getName();
		title=title.substring(title.lastIndexOf('.')+1);
		jp.setBorder(new TitledBorder(title));
		for(String id: ids){
			AbstractButton ab=new JButton("fail");
			try{
				//Get the dynamic constructor method that takes a String argument:
				Constructor ctor=kind.getConstructor(String.class);
				//Create a new object
				ab=(AbstractButton) ctor.newInstance(id);
			}catch (Exception e) {
				// TODO: handle exception
				System.err.println("can't create "+kind);
			}
			bg.add(ab);
			jp.add(ab);
		}
		return jp;
	}
	public ButtonGroups() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		add(makeBPanel(JButton.class, ids));
		add(makeBPanel(JToggleButton.class, ids));
		add(makeBPanel(JCheckBox.class, ids));
		add(makeBPanel(JRadioButton.class, ids));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new ButtonGroups(), 500, 350);
	}

}
