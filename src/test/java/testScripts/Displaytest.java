
package testScripts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Displaytest {
	public static void main(String[] args) 
		{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.automationbookstore.dev");
driver.findElement(By.id("searchBar")).sendKeys("Test");
WebElement closeicon =driver.findElement(By.cssSelector("a[title='Clear text']"));
System.out.println(closeicon.isDisplayed());
if(closeicon.isDisplayed())
{
	closeicon.click();
}


}

}
