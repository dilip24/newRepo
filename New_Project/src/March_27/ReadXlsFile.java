package March_27;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadXlsFile 
{
	
	public static void main(String[] args) throws BiffException, IOException
	{
		File f = new File("../New_Project/ReadExcel.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell wc = ws.getCell(j, i);
				System.out.println(wc.getContents());
			}
		}
	
	}

}
