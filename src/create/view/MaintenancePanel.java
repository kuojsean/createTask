package create.view;

import create.controller.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MaintenancePanel extends JPanel
{

	private MaintenanceController appController;
	private SpringLayout baseLayout;
	
	private JButton plumbingButton;
	private JButton electricianButton;
	private JButton lawncareButton;
	
	private JButton choiceOne;
	private JButton choiceTwo;
	
	private JTextArea description;
	private JPanel firstType;
	private JPanel secondType;
	
	public MaintenancePanel (MaintenanceController appController) 
	{
		super();
		this.appController = appController;
		
		baseLayout = new SpringLayout();
		
		plumbingButton = new JButton("Plumbing");
		electricianButton = new JButton("Electrician");
		lawncareButton = new JButton("Lawncare");
		
		choiceOne = new JButton("Option 1");
		choiceTwo = new JButton("Option 2");
		
		description = new JTextArea();
		firstType = new JPanel();
		secondType = new JPanel();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setLayout(baseLayout);
		
		this.add(plumbingButton);
	}
	
}
