
public class Source {

	public static void main(String[] args) {
		
		CarParts obj;
		
		Wheel wheel = new Wheel("ToJO", 120, 18, 150);
		Battery battery = new Battery("Lion", 200, 14, "Li-ion");
		
		obj = wheel;
		System.out.println(obj.ShowInfo());
		obj = battery;
		System.out.println(obj.ShowInfo());
		
	}

}
