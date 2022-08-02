package Demo.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Write 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("F:\\Softwere\\Execl Prjoect\\Demo.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("sheet1");
		XSSFRow row=sheet.getRow(1);
		XSSFRow row1=sheet.getRow(2);
		
		XSSFCell cell=row.getCell(0);
		XSSFCell cell1=row.getCell(1);
		XSSFCell cell2=row1.getCell(0);
		XSSFCell cell3=row1.getCell(1);
		String uname=cell.getStringCellValue();
		String ps=cell1.getStringCellValue();
		String uname1=cell2.getStringCellValue();
		String ps1=cell3.getStringCellValue();
		System.out.println(uname);
		System.out.println(ps);
		System.out.println(uname1);
		System.out.println(ps1);
		sheet.getRow(1).createCell(2).setCellValue("Pass");
		sheet.getRow(2).createCell(2).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream("F:\\Softwere\\Execl Prjoect\\Demo.xlsx");
		wb.write(fos);
	}
}
