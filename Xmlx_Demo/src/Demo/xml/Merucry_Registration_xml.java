package Demo.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Merucry_Registration_xml {
		public static void main(String[] args) throws IOException, InterruptedException {
			FileInputStream fis=new FileInputStream("F:\\\\Softwere\\\\Execl Prjoect\\\\Demo.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("Sheet2");
			Properties pro=new Properties();
			XSSFRow row=sheet.getRow(2);
			
			XSSFCell un=row.getCell(1);
			XSSFCell ln=row.getCell(2);
			XSSFCell mob=row.getCell(3);
			XSSFCell mail=row.getCell(4);
			XSSFCell add=row.getCell(5);
			XSSFCell city=row.getCell(6);
			XSSFCell state=row.getCell(7);
			XSSFCell pin=row.getCell(8);
			XSSFCell uid=row.getCell(9);
			XSSFCell pass=row.getCell(10);
			
			String name=un.getStringCellValue();
			String surname=ln.getStringCellValue();
			String mail1=mail.getStringCellValue();
			String mobile=mob.getStringCellValue();
			String address=add.getStringCellValue();
			String city1=city.getStringCellValue();
			String state1=state.getStringCellValue();
			String pin1=pin.getStringCellValue();
			String username=uid.getStringCellValue();
			String userpass=pass.getStringCellValue();
			pro.load(fis);
			
			System.setProperty("webdriver.chrome.driver", "D:\\Exe\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/register.php");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(surname);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(mobile);
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(mail1);
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address);
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city1);
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state1);
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(pin1);
			WebElement dd=driver.findElement(By.xpath("//option/parent::select"));
			Select s=new Select(dd);
			s.selectByIndex(100);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(userpass);
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(userpass);
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			
			Thread.sleep(3000);
			driver.close();
		}
}
