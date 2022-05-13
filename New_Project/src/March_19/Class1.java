package March_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Class1 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("../New_Project/TFH.txt");
		//Reading a txt file character by character
		/*FileReader fr = new FileReader(f);
		int r;
		while((r=fr.read())!=-1)
		{
			System.out.println((char)r);
		}*/
		
		//Reading a txt file line by line
		/*FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}*/
		
		//Writing a single line in the txt file
		/*FileWriter fw = new FileWriter(f);
		fw.write("First line written");
		fw.write("Second line written");
		fw.close();*/

		//Writing multiple lines in the txt file
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write("Third line");
		bw.newLine();
		bw.write("Fourth line");
		bw.close();
		
	}

}
