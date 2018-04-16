package create.model;

import java.util.*;

public abstract class Business
{
	private int businessNumber;
	private long phoneNumber;
	private int priceRangeLow;
	private int priceRangeHigh;
	private String businessName;
	private String address;
	private String hoursOpen;
	
	public Business(int businessNumber, String businessName)
	{
		this.businessNumber = businessNumber;
		this.businessName = businessName;
	}
	
	public String[] getBusinessTypes()
	{
		String [] type = null;
		ArrayList<String> parentType = new ArrayList<String>();
		Class<?> currentBusiness = this.getClass();
		
		while(currentBusiness.getSuperclass() != null)
		{
			Class<?> [] businessTypes = currentBusiness.getInterfaces();
			type = new String[businessTypes.length];
			
			for (int index = 0; index < type.length; index++)
			{
				String currentInterface = businessTypes[index].getCanonicalName();
				if(!parentType.contains(currentInterface))
				{
					parentType.add(currentInterface);
				}
			}
			currentBusiness = currentBusiness.getSuperclass();
		}
		
		type = new String [parentType.size()];
		
		for(int index = 0; index < parentType.size(); index ++)
		{
			type[index] = parentType.get(index);
		}
		return type;
	}
	
	public String toString()
	{
		String description = businessName + "\nPhone Number: " + phoneNumber + "\nPrice: " + priceRangeLow + " - " + priceRangeHigh + "\nHours: " + hoursOpen + "\nAddress" + address;
		return description;
	}
	
	public int getBusinessNumber()
	{
		return businessNumber;
	}
	
	public long getPhoneNumber()
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
	
	public String getAddress()
	{
		return address;
	}
	
	private String getHours()
	{
		return hoursOpen;
	}
	
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public void setLowPrice(int priceRangeLow)
	{
		this.priceRangeLow = priceRangeLow;
	}
	
	public void setHighPrice(int priceRangeHigh)
	{
		this.priceRangeHigh = priceRangeHigh;
	}
	
	public void setBusinessName(String businessName)
	{
		this.businessName = businessName;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setHours(String hoursOpen)
	{
		this.hoursOpen = hoursOpen;
	}
}
