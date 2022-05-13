package March_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TFH5 
{
	public void ReadandWriteData () throws IOException
	{
		File f1 = new File("D://Workshop/ReadData.txt");
		File f2 = new File("D://Workshop/CopiedData.txt");
		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String s;
		while((s=br.readLine())!=null)
		{
			bw.write(s);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws IOException
	{
		TFH5 rwd = new TFH5();
		rwd.ReadandWriteData();
	}

}
