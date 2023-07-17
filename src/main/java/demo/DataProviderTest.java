package demo;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test (dataProvider = "loginTestData")
	public void loginHRM(String userName, String password) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='username']")));

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(@class,'oxd-userdropdown')])[1]")));
		boolean userDropdown = driver.findElement(By.xpath("(//*[contains(@class,'oxd-userdropdown')])[1]"))
				.isDisplayed();

		assertTrue(userDropdown, "User dropDown is not displayed");
		Thread.sleep(2000);
		driver.quit();
	}

	@DataProvider(name = "loginTestData")
	public String[][] loginData() {
		String data[][] = new String[2][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Admin";
		data[1][1] = "123";

		return data;
	}
}
