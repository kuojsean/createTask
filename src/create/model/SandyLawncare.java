package create.model;

public class SandyLawncare extends Business implements Lawncare
{

	protected void setup()
	{
		this.setAddress("4563 Sandy Lawns Bend");
		this.setHighPrice(20);
		this.setLowPrice(7);
		this.setPhoneNumber(1252367);
		this.setHours("1PM - 5PM");
	}
	
	public SandyLawncare()
	{
		super(4, "Sandy Lawncare");
	}
}
