package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 {

	public static void main(String[] args) {
		
		WebDriver wb;
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		
		wb = new ChromeDriver();
		wb.get("https://opensource-demo.orangehrmlive.com/");
		
		//wb.findElement(By.id("txtUsername")).sendKeys("Admin");
		wb.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		wb.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		wb.findElement(By.xpath("//*[@id='btnLogin']")).click();
		//*[@id='txtUsername']
		//*[@id='txtPassword']
		//*[@id='btnLogin']
		
	}

}
