package testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v120.runtime.model.DeepSerializedValue.Type;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoteDriver {
WebDriver driver;
@Test
public void test() throws MalformedURLException {
	ChromeOptions options =new ChromeOptions();
	options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	String strHub="http://172.31.14.140:4444";
	driver=new RemoteWebDriver(new URL(strHub),options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    WebElement searchbox =driver.findElement(By.name("q"));
    searchbox.sendKeys("JAVA TUTORIAL");
    searchbox.submit();
    System.out.println("Page Title is " +driver.getTitle());
    Assert.assertEquals(driver.getTitle(), "JAVA TUTORIAL -Google Search");

}

}
