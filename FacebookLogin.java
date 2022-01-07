package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//form//a[text() = 'Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("saranya");
		driver.findElement(By.name("lastname")).sendKeys("Tamil");
		driver.findElement(By.name("reg_email__")).sendKeys("saran99");
		driver.findElement(By.id("password_step_input")).sendKeys("12345678");
		
		WebElement day=driver.findElement(By.id("day"));
		Select dropdown=new Select(day);
		dropdown.selectByValue("7");
		
		WebElement mon=driver.findElement(By.id("month"));
		Select dropdown1=new Select(mon);
		dropdown.selectByValue("Oct");
		
		WebElement year=driver.findElement(By.id("year"));
		Select dropdown2=new Select(year);
		dropdown.selectByValue("1993");
		
		driver.findElement(By.className("_58mt")).click();
		driver.findElement(By.name("websubmit"));
		driver.close();
		
	}

}
