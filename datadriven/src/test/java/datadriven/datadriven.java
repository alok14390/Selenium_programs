package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datadriven {
	
	WebDriver driver;
	public static  String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Test
	public void tc1() throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		File excel= new File("/Users/Aloke/Desktop/orangehrm.xlsx");
		FileInputStream fis= new FileInputStream(excel);
		XSSFWorkbook wb= new XSSFWorkbook(fis); //total no of sheets
		XSSFSheet sh=wb.getSheet("sheet1");    //particular sheet
		int rowcount=sh.getLastRowNum();
		for(int i=0;i<=rowcount;i++) {
			String user=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(user);
			String pass=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(pass);
			driver =new ChromeDriver();
			driver.get(url);
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys(user);
			driver.findElement(By.name("password")).sendKeys(pass);
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			String str=driver.getCurrentUrl();
			if(str.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/ind"))
			{
			
				driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@href='/web/index.php/auth/logout']")).click();
				driver.close();
				
				
			}else{
				System.out.println(str);
				for(int j=i+1;j<=i;j++)//j=2
				{
					String user1=sh.getRow(j).getCell(0).getStringCellValue();//
					String pass2=sh.getRow(j).getCell(1).getStringCellValue();
					System.out.println(user);
					System.out.println(pass);
					Thread.sleep(5000);
					driver.findElement(By.name("username")).sendKeys(user1);
					driver.findElement(By.name("password")).sendKeys(pass2);
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@type='submit']")).click();
					break;	
					
				}
				
				
			}
			
			
		}
		driver.close();
		
		
	}
	
	
	
	
}