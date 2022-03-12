package Day4;

public class Camry extends Toyota
{
	public void model()
	{
		System.out.println("Toyota Camry is a Hybrid electric model");
	}
	public static void main(String[] args)
	{
		Camry car = new Camry();
		car.model();
		car.origin();
	}

}
