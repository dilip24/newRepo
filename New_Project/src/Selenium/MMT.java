package Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MMT 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../New_Project/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		try
		{
		driver.findElementByXPath("//div[@class='loginModal displayBlock modalLogin dynHeight personal']").click();
		driver.findElementByXPath("//span[@class='langCardClose']").click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(2000);
		WebElement from = driver.findElementByXPath("//input[@id='fromCity']");
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement selectfrom = driver.findElementByXPath("//input[@placeholder='From']");
		selectfrom.sendKeys("Che");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		WebElement selectto = driver.findElementByXPath("//input[@placeholder='To']");
		selectto.sendKeys("Ban");
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[contains(@aria-label,'Mon May 02 2022')]").click();
		driver.findElementByXPath("//a[contains(text(),'Search')]").click();
	}

}
