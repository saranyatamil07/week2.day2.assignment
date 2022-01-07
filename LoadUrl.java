package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoadUrl {
	public static void main(String[] args) {
	
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver() ;
	driver.manage().window().maximize();
	driver.get("https://acme-test.uipath.com/login");
	String title=driver.getTitle();
	System.out.println(title);
	
	
	driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.id("password")).sendKeys("leaf@12");
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.findElement(By.linkText("log Out")).click();
	
	}
}
