package March_27;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadXlsFile3 
{
	public static void ReadDataBasedUponRange(int s, int e) throws BiffException, IOException
	{
		File f = new File("../New_Project/ReadExcel.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		for(int i=s;i<=e;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell wc = ws.getCell(j,i);
				System.out.println("Content available in rows "+s+" to "+e+" of column "+(j)+" : "+wc.getContents());
			}
		}	
	}
	
	public static void main(String[] args) throws BiffException, IOException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the starting row no.");
		int a = s.nextInt();
		System.out.println("Enter the ending row no.");
		int b = s.nextInt();
		ReadDataBasedUponRange(a,b);
	}
}