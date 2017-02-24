package SeeleniumTest;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class DataDriven {
	@DataProvider(name="testdata")
	public Object[][] readExcel() throws BiffException, IOException 
	{
	File f= new File("C:/Users/rojalins/Desktop/GmailDataProvider.xls");
	Workbook wb=Workbook.getWorkbook(f);
    Sheet s= wb.getSheet(0);
    int rows=s.getRows();
    int columns=s.getColumns();
    System.out.println(rows);
    System.out.println(columns);
    
    String storedata[][]=new String[rows][columns];
    for(int i=0;i<rows;i++)
    {
    	for(int j=0;j<columns;j++)
    	{
    		Cell c=s.getCell(j, i);
    		storedata[i][j]=c.getContents();
    		//System.out.println(storedata[i][j]);
    		
    	}
    }
    return storedata;

	}

}
