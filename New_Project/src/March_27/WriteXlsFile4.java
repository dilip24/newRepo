package March_27;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteXlsFile4 
{
	public static void WriteData(int rowCount, int columnCount) throws IOException, RowsExceededException, WriteException
	{
		File f = new File("../New_Project/WriteExcel.xls");
		WritableWorkbook wk = Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("Dilip", 0);
		System.out.println("Please enter the data");
		Scanner s = new Scanner(System.in);
		String data;
		for(int i=0;i<rowCount;i++) //loop for rows
		{
			for(int j=0;j<columnCount;j++) //loop for columns
			{
				data = s.next();
				Label L = new Label(j, i, data); //cell structure
				ws.addCell(L);
			}
		}
		wk.write(); //for saving the file
		wk.close(); //for closing the file
	}
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row count");
		int a = s.nextInt();
		System.out.println("Enter the column count");
		int b = s.nextInt();
		WriteData(a,b);
	}
}
