package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

driver.get("https://the-internet.herokuapp.com/login");
driver.findElement(By.id("username")).sendKeys("tomsmith");
//driver.findElement(By.cssSelector("input[name='username']"));
	driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in')]")).click();
	driver.findElement(By.className("fa fa-2x fa-sign-in")).click();
	}
}
