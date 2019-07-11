package mavenbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver =null;
	@BeforeTest
	public void setup(){

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void test(){



		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("vishal");
		driver.findElement(By.name("btnK")).submit();

	}

	@AfterTest
	public void teardown(){
		driver.close();
		driver.quit();



	}


}


