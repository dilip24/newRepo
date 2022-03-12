package Day1;

public class Student 
{
	int age;
	int roll_no;
	
	public void display1() 
	{
		System.out.println("Welcome all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args)
	{
		Student details = new Student();
		details.display1();
		details.display2();
		details.age = 24;
		details.roll_no = 16;
		System.out.println("1st Student's age is "+details.age);
		System.out.println("1st Student's roll no is "+details.roll_no);
		details.age = 25;
		details.roll_no = 18;
		System.out.println("2nd Student's age is "+details.age);
		System.out.println("2nd Student's roll no is "+details.roll_no);
	}
}
