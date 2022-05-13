package March_27;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class CopyXlsFile 
{
	public static void CopyData() throws IOException, BiffException, RowsExceededException, WriteException
	{
		File f1 = new File("../New_Project/WriteExcel.xls");
		File f2 = new File("../New_Project/CopiedExcel.xls");
		Workbook wk1 = Workbook.getWorkbook(f1);
		Sheet ws1 = wk1.getSheet(0);
		WritableWorkbook wk2 = Workbook.createWorkbook(f2);
		WritableSheet ws2 = wk2.createSheet("DK", 0);
		int r = ws1.getRows();
		int c = ws1.getColumns();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell wc1 = ws1.getCell(j, i);
				//System.out.println(wc1.getContents());
				Label L = new Label(j, i, wc1.getContents()); //cell structure
				ws2.addCell(L);
			}
		}
		wk2.write();
		wk2.close();
	}
	
	public static void main(String[] args) throws RowsExceededException, BiffException, WriteException, IOException 
	{
		CopyXlsFile.CopyData();
	}
}
