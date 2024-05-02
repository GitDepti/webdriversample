package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePageTest {
	public static void main(String[] args) {
//ChromeOptions Options =new ChromeOptions();
//Options.setBrowserVersion("115");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com");
System.out.println("The title of page is " +driver.getTitle());
WebElement srcbox =driver.findElement(By.className("gLFyf"));
srcbox.sendKeys("Java Tutorial");
srcbox.sendKeys(Keys.ENTER);

	}
}