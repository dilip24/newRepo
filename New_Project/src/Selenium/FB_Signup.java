package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Signup 
{
	ChromeDriver driver;
	@Before
	public void Launch() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../New_Project/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
		//code for signup
		
	@Test
	public void Signup() throws InterruptedException
	{
		WebElement create = driver.findElementByXPath("//a[contains(@id,'u_0_2_')]");
		create.click();
		Thread.sleep(3000);
		WebElement firstname = driver.findElementByXPath("//input[@name='firstname']");
		firstname.sendKeys("Dhruv");
		WebElement lastname = driver.findElementByXPath("//input[@type='text' and @name='lastname']");
		lastname.sendKeys("Vikram");
		WebElement email = driver.findElementByXPath("//input[@aria-label='Mobile number' or @name='reg_email__']");
		email.sendKeys("writetogenius2020@gmail.com");
		Thread.sleep(2000);
		WebElement confirmEmail = driver.findElementByXPath("//input[@*='text' and @*='reg_email_confirmation__']");
		confirmEmail.sendKeys("writetogenius2020@gmail.com");
		WebElement password = driver.findElementByXPath("//*[@name='reg_passwd__']");
		password.sendKeys("newpassword1234");
		WebElement day = driver.findElementByXPath("//*[@*='birthday_day']");
		Select d = new Select(day);
		d.selectByIndex(11);
		WebElement month = driver.findElementByXPath("//*[@name='birthday_month']");
		Select m = new Select(month);
		m.selectByVisibleText("Nov");
		WebElement year = driver.findElementByXPath("//*[@*='year']");
		Select y = new Select(year);
		y.selectByValue("1992");
		Thread.sleep(2000);
		WebElement gender = driver.findElementByXPath("(//input[contains(@id,'u_')])[7]");
		gender.click();
		WebElement signup = driver.findElementByXPath("//*[@*='submit' and @*='websubmit']");
		signup.click();
		Thread.sleep(12000);
	}
	
	@After
	public void Close() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.quit();
	}

}
