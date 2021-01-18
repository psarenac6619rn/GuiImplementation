package action;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import gui.EntryFrame;
import gui.MainFrame;

public class DatabaseFilter extends MyAbstractAction{

	private JOptionPane jop;
	
	public DatabaseFilter() {
		
		putValue(NAME, "Import database");
		
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		
		String s = EntryFrame.getInstance().getJfc().getSelectedFile().getAbsolutePath();
		String sa = EntryFrame.getInstance().getJfc().getSelectedFile().getName();
		
		System.out.println(s);
		System.out.println(sa);
		
		String provera = MainFrame.getInstance().getPam();
		System.out.println(provera);
		
		String nesto = "." + provera;
		System.out.println(nesto);
		File folder = new File(s);
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        if(file.getName().endsWith(nesto)) {
		    	System.out.println(file.getName());
		    	}else {
		        	JOptionPane.showMessageDialog(MainFrame.getInstance(),
		    			    "Doslo je do greske.");
		        	return;
		        }
		    }
		}
		
		
		
		EntryFrame.getInstance().setVisible(false);
		MainFrame.getInstance().setVisible(true);
	}

	
	
	
	
	

}
