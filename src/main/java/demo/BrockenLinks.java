package demo;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrockenLinks {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));	// get all links webelement
		System.out.println("Total Links : " + allLinks.size());
		int counter = 1;
		for (WebElement link : allLinks) {	// iterate one by one 
			String linkURL = link.getAttribute("href");	// and get link 
			URL url = new URL(linkURL);					// Pass the link to url class from java.net
			CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));	// to accept all cookies 
			URLConnection urlConnection = url.openConnection();	//create connection
			HttpURLConnection httpUrlConnection = ((HttpURLConnection)urlConnection);	// typecast the urlConnection to get http responce
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			if(httpUrlConnection.getResponseCode()==200) {
				System.out.println(linkURL + " => " + httpUrlConnection.getResponseMessage() + " => " + counter);
			} else {
				System.out.println(linkURL + " => " + httpUrlConnection.getResponseCode() + " => " + httpUrlConnection.getResponseMessage() + " => " + counter);
			}
			counter++ ;
		}
		driver.quit();
	}
}
