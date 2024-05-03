package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	Select singsel=new Select(driver.findElement(By.id("select-demo")));
	singsel.selectByValue("Tuesday");
	Select mulsel=new Select(driver.findElement(By.id("multi-select")));
	}

}
