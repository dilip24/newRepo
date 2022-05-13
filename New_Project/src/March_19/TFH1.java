package March_19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TFH1 
{
	public void ReadData (int rnum) throws IOException
	{
		File f = new File("../New_Project/ReadData.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		int count=0;
		while((s=br.readLine())!=null)
		{
			count = count+1;
			if(count==rnum)
			{
				System.out.println(s);
				break;
			}
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row no.");
		int num = sc.nextInt();
		TFH1 rd = new TFH1();
		rd.ReadData(num);
	}

}
