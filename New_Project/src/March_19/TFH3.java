package March_19;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TFH3 
{
	public void WriteData (int count) throws IOException
	{
		File f = new File("../New_Project/WriteData.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner s = new Scanner(System.in);
		String data = null;
		for(int i=1;i<=count;i++)
		{
			data = s.next();
			bw.write(data);
			bw.newLine();
		}
		bw.close();
	}
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row count for the data to be written :");
		int num = sc.nextInt();
		TFH3 wd = new TFH3();
		wd.WriteData(num);
	}

}
