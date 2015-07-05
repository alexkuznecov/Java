
public class Wheel extends CarParts {
	
	private double radius;
	private double maxWeight;
	
	public Wheel() {}
	
	public Wheel(String nameOfParts, double cost, double radius, double maxWeight)
	{
		super(nameOfParts, cost);
		this.radius = radius;
		this.maxWeight = maxWeight;
	}
	
	public String ShowInfo()
	{
		String str = super.ShowInfo();
		str = str + " InWheel " + radius + " " + maxWeight;
		return str;
	}
}
