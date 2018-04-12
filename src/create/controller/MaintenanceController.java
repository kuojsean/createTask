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
		
	}
	
	public void start()
	{
		
	}
	
	
}
