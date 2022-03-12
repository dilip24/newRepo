package Day4;

public class Hybrid extends Camry
{
	public void concept()
	{
		System.out.println("Hybrids use a combination of petrol and electricity to power the car");
	}
	public static void main(String[] args)
	{
		Hybrid variety = new Hybrid();
		variety.concept();
		variety.model();
		variety.origin();
	}
}
