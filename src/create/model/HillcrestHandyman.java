package create.model;

public class HillcrestHandyman extends Business implements Electrician, Plumber
{

	protected void setup()
	{
		this.setAddress("2222 Handyman Road");
		this.setHighPrice(800);
		this.setLowPrice(12);
		this.setPhoneNumber(2222222);
		this.setHours("7AM - 11PM");
	}
	
	public HillcrestHandyman()
	{
		super(2, "Hillcrest Handyman");
	}
}
