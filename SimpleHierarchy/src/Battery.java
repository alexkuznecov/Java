
public class Battery extends CarParts {
	
	private int voltage;
	private String type;
	
	public Battery() {}
	
	public Battery(String nameOfParts, double cost, int voltage, String type)
	{
		super(nameOfParts, cost);
		this.voltage = voltage;
		this.type = type;
	}
	
	public String ShowInfo()
	{
		String str = super.ShowInfo();
		str = str + " InBattery " + voltage + " " + type;
		return str;
	}
}
