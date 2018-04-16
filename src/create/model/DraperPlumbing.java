package create.model;

public class DraperPlumbing extends Business implements Plumber
{

	protected void setup()
	{
		this.setAddress("1111 Plumbing Street Way");
		this.setHighPrice(300);
		this.setLowPrice(15);
		this.setPhoneNumber(1234567);
		this.setHours("9AM - 9PM");
	}
	
	public DraperPlumbing()
	{
		super(1, "Draper Plumbing");
	}
}
