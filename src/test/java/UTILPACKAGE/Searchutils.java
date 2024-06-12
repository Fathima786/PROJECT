package UTILPACKAGE;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Searchutils {
	public static String search (String loc,String sheet,int r, int c)
	{
		try
		{
			FileInputStream f=new FileInputStream(loc);
			XSSFWorkbook w=new XSSFWorkbook(f);
			XSSFCell cell= w.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
		}
		catch(Exception e)
		{
			return "";
		}
	}
	
	public static int countofrow(String loc,String sheet)
	{
		try
		{
			FileInputStream f=new FileInputStream(loc);
			XSSFWorkbook w=new XSSFWorkbook(f);
			return w.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			return 0;
		}
		
	}

}
