package create.controller;

import create.view.*;
import create.model.*;
import java.util.*;

public class MaintenanceController
{
	private List<Business> businessList;
	private MaintenanceFrame appFrame;
	
	public MaintenanceController()
	{
		businessList = new ArrayList<Business>();
		setupBusinessList();
		appFrame = new MaintenanceFrame(this);
	}
	
	private void setupBusinessList()
	{
		businessList.add(new DraperPlumbing());
		businessList.add(new HillcrestHandyman());
		businessList.add(new MidvaleMowing());
		businessList.add(new SandyLawncare());
		businessList.add(new WasatchRepair());
	}
	
	public List<Business> getBusinessList()
	{
		return businessList;
	}
	
	public boolean isValidInteger(String input)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(input);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Only integer values are valid.");
		}
		
		return valid;
	}
	
	public boolean isValidDouble(String input)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(input);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Only double values are valid.");
		}
		
		return valid;
	}
	
	public void start()
	{
		
	}
	
	
}
