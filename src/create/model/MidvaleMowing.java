package create.model;

public class MidvaleMowing extends Business implements Lawncare
{

	protected void setup()
	{
		this.setAddress("333 Mow Grass Lane");
		this.setHighPrice(50);
		this.setLowPrice(14);
		this.setPhoneNumber(3333333);
		this.setHours("8AM - 6PM");
	}
	
	public MidvaleMowing()
	{
		super(3, "Midvale Mowing");
	}
}
