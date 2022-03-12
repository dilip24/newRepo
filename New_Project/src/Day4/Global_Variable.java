package Day4;
//Differentiating local variable and global variable using this keyword
public class Global_Variable
{
	int g;
	public void m1(int g)
	{
		this.g=g;
	}
	public static void main(String[] args)
	{
		Global_Variable obj = new Global_Variable();
		obj.m1(24);
		System.out.println("The value of global variable is "+obj.g);
	}

}
