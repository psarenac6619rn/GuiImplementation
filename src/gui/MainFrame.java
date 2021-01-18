package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTable;

import view.TableModel;

public class MainFrame extends JFrame{
	
private static MainFrame instance;
	
	private JSplitPane split;
	private JTable tabela;
	private ToolBar toolbar;
	
	private JTable jtable;
	private TableModel tablemodel;
	private String pam ;
	
	
	private MainFrame() {
		this.setTitle("SK Projekat");
		this.setSize(new Dimension(800,500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initElements();
		addElements();
	}

	private void addElements() {
		add(split,BorderLayout.CENTER);
		
		
	}

	private void initElements() {
		
		toolbar = new ToolBar();
	
		tablemodel = new TableModel();
		tablemodel.addColumn("Kurtoni");
		tablemodel.insertRow(0, new Object[] {"Baskela"});
		jtable = new JTable(tablemodel);
		split = new JSplitPane(JSplitPane.VERTICAL_SPLIT,jtable,toolbar);
		split.setDividerLocation(400);
		
		pam = "json";
		//pam = "xml";
		//pam = "kastom";
		
	}
	
	public static MainFrame getInstance() {
		if(instance == null)
			instance = new MainFrame();
		return instance;
	}

	public JSplitPane getSplit() {
		return split;
	}

	public void setSplit(JSplitPane split) {
		this.split = split;
	}

	public JTable getTabela() {
		return tabela;
	}

	public void setTabela(JTable tabela) {
		this.tabela = tabela;
	}

	public ToolBar getToolbar() {
		return toolbar;
	}

	public void setToolbar(ToolBar toolbar) {
		this.toolbar = toolbar;
	}

	public TableModel getTablemodel() {
		return tablemodel;
	}

	public void setTablemodel(TableModel tablemodel) {
		this.tablemodel = tablemodel;
	}

	public String getPam() {
		return pam;
	}

	public void setPam(String pam) {
		this.pam = pam;
	}
	        
	    	
	
	
}
