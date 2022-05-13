package March_19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TFH2 
{
	public void ReadDataofRange (int start, int end) throws IOException
	{
		File f = new File("../New_Project/ReadData.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		int count=0;
		while((s=br.readLine())!=null)
		{
			count = count+1;
			if((count>=start)&&(count<=end))
			{
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Read data from row no.");
		int a = sc.nextInt();
		System.out.println("Read data upto row no.");
		int b = sc.nextInt();
		TFH2 rdr = new TFH2();
		rdr.ReadDataofRange(a,b);
	}

}
