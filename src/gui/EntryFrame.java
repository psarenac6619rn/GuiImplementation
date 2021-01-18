package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.plaf.BorderUIResource;

import action.ActionManager;

public class EntryFrame extends JFrame{

	private static EntryFrame instance;
	
	private JFileChooser jfc;
	private JButton baseimport;
	
	
	private EntryFrame() {
		
		this.setTitle("Chose database");
		this.setSize(new Dimension(400,400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initElements();
		addElements();
	}
	
	
	
	public static EntryFrame getInstance() {
		if(instance==null)
			instance = new EntryFrame();
		return instance;
	}
	
	private void initElements() {
		
		jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		baseimport = new JButton(ActionManager.getInstance().getDbf());
	}
	
	private void addElements() {
		
		this.add(jfc,BorderLayout.CENTER);
		this.add(baseimport,BorderLayout.SOUTH);
	}



	public JFileChooser getJfc() {
		return jfc;
	}



	public void setJfc(JFileChooser jfc) {
		this.jfc = jfc;
	}



	public JButton getBaseimport() {
		return baseimport;
	}



	public void setBaseimport(JButton baseimport) {
		this.baseimport = baseimport;
	}
	
	
}
