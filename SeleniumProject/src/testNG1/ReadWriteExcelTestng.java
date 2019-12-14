package testNG1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadWriteExcelTestng {
	@Test
	public void writeExcel() throws IOException {
		FileInputStream fin = new FileInputStream("D:\\Test5.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
  
		XSSFSheet sheet = workbook.createSheet();
		System.out.println("Writing to Excel File");
		
		for(int i=0;i<=5;i++) {
		Row row=sheet.createRow(i);
		
		for(int j=0,c=0;j<=3;j++)
		{
			Cell cell = row.createCell(++c);
			cell.setCellValue("add");
			//System.out.println("added");
		}
	}
		try (FileOutputStream outputStream = new FileOutputStream("D:\\Test5.xlsx")) {
            workbook.write(outputStream);
        }
	}
	
	@Test
	public void readExcel() throws IOException {
		FileInputStream fin = new FileInputStream("D:\\Test3.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fin);

		XSSFSheet sheet = workbook.getSheetAt(0);
		System.out.println("Reading from Excel File");
		
		for(int i=0;i<3;i++)
		{
		XSSFCell r0 = sheet.getRow(0).getCell(i);
		System.out.print("  "+r0+"  ");
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
		XSSFCell r1 = sheet.getRow(1).getCell(i);
		
		XSSFCell r3 = sheet.getRow(1).getCell(i);
		System.out.print("  "+r1+"  ");
		
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
		XSSFCell r2 = sheet.getRow(2).getCell(i);
		System.out.print("  "+r2+"  ");
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
		XSSFCell r3 = sheet.getRow(3).getCell(i);
		System.out.print("  "+r3+"  ");
		}
		}
	}

	
