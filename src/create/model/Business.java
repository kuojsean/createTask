package create.model;

import java.util.*;

public abstract class Business
{
	private int businessNumber;
	private int phoneNumber;
	private int priceRangeLow;
	private int priceRangeHigh;
	private String businessName;
	private String maintenanceType;
	private String address;
	private String hoursOpen;
	
	public Business(int businessNumber, String businessName)
	{
		this.businessNumber = businessNumber;
		this.businessName = businessName;
	}
	
	public String toString()
	{
		String description = businessName + "\nPhone Number: " + phoneNumber + "\nPrice: " + priceRangeLow + " - " + priceRangeHigh + "\nType: " + maintenanceType + "\nHours: " + hoursOpen + "\nAddress" + address;
		return description;
	}
	
	public int getBusinessNumber()
	{
		return businessNumber;
	}
	
	public int getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public int getLowPrice()
	{
		return priceRangeLow;
	}
	
	public int getHighPrice()
	{
		return priceRangeHigh;
	}
	
	public String getBusinessName()
	{
		return businessName;
	}
	
	public String get
}
