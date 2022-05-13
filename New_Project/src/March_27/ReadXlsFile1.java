package March_27;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadXlsFile1 
{
	public static void ReadDataBasedUponRowNoAndColumnNo(int a, int b) throws BiffException, IOException
	{
		File f = new File("../New_Project/ReadExcel.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		Cell wc = ws.getCell(b,a);
		System.out.println("Content in the Cell is : "+wc.getContents());
	}
	
	public static void main(String[] args) throws BiffException, IOException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row no.");
		int a = s.nextInt();
		System.out.println("Enter the column no.");
		int b = s.nextInt();
		ReadDataBasedUponRowNoAndColumnNo(a,b);
	}

}