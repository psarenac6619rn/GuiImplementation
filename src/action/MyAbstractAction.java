package action;


import java.net.URL;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class MyAbstractAction extends AbstractAction{

	public Icon loadIcon(String fileName){
		URL imageURL = getClass().getResource(fileName);
		Icon icon = null;
		
		if (imageURL != null)                       
	        icon = new ImageIcon(imageURL);
		
		return icon;
	}
}	