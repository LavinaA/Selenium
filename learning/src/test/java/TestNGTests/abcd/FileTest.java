package TestNGTests.abcd;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FileTest {

	public static void main(String[] args) throws BiffException, IOException {
		File f = new File("/home/ravi/Desktop/InputNew.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int rows=s.getRows();
		int columns=s.getColumns();
		/*System.out.println(rows);
		System.out.println(rows);*/
		
		String [][] inputData=new String [rows][columns];
		for (int i =0;i<rows;i++){
			for (int j=0;j<columns;j++){
				Cell c = s.getCell(j,i);
				inputData[i][j] = c.getContents();
				System.out.println(inputData[i][j]);
			}
		}
		System.out.println(inputData);
	}
	
}
