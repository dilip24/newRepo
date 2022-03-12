package Day4;

public class Fortuner extends Toyota
{
	public void model()
	{
		System.out.println("Legender is the new Fortuner model");
	}
	public static void main(String[] args)
	{
		Fortuner car = new Fortuner();
		car.model();
		car.origin();
	}
}
