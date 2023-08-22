package demo;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;

public class Simple {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\drivers\\Chrome\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\abc\\1.png");
		FileUtils.copyDirectory(src, dest);
		
		FileInputStream xcelFile = new FileInputStream("D:\\abc.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(xcelFile);
		String xcelValue = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(xcelValue);
		wb.close();
		
		WebElement button = driver.findElement(By.xpath(""));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", button);
		
		FileInputStream propFile = new FileInputStream("D:\\Property.Properties");
		Properties prop = new Properties();
		prop.load(propFile);
		prop.getProperty("Key");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("abc", "abc", "msg");
		sa.assertAll();
		
		
		Assert.assertEquals("", "");
		
		
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> allWindowAL = new ArrayList<String>(allWindows);
		driver.switchTo().window(allWindowAL.get(1));

		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		alt.dismiss();
		alt.getText();
		
		
		Select sel = new Select(button);
		sel.selectByVisibleText("ABC");
		
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().build().perform();
		
		
		driver.switchTo().frame(1);
		//action
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"Boy's cloths\"]"));
		
	}
	
	@AfterMethod
	public void listner(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println();
		}
	}
}
