package March_19;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TFH4 
{
	public void WriteDatainRange (int start, int end) throws IOException
	{
		File f = new File("../New_Project/WriteData.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner s = new Scanner(System.in);
		String data = null;
		for(int i=1;i<=end;i++)
		{
			if((i>=start)&&(i<=end))
			{
				data = s.next();
				bw.write(data);
				bw.newLine();
			}
			else
			{
				bw.newLine();
			}
		}
		bw.close();
	}
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting row :");
		int s = sc.nextInt();
		System.out.println("Enter the ending row :");
		int e = sc.nextInt();
		TFH4 wdr = new TFH4();
		wdr.WriteDatainRange(s,e);
	}

}
