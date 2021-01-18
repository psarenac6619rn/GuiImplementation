package gui;

import javax.swing.JToolBar;

import action.ActionManager;

public class ToolBar extends JToolBar{

	public ToolBar() {
		add(ActionManager.getInstance().getAddaction());
		add(ActionManager.getInstance().getRemoveaction());
	}
	
}
