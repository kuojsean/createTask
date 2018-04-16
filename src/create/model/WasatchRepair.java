package create.model;

public class WasatchRepair extends Business implements Electrician
{

	protected void setup()
	{
		this.setAddress("5 Main State");
		this.setHighPrice(1000);
		this.setLowPrice(100);
		this.setPhoneNumber(4567456);
		this.setHours("24/7");
	}
	
	public WasatchRepair()
	{
		super(5, "Wasatch Repair");
	}
}
