package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample_Page 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../New_Project/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		//Options opt = driver.manage();
		//Window win = opt.window();
		//win.maximize();
		driver.manage().window().maximize();
		//code for login
		/*WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("diliprajasekar1610");
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("dilip1610");
		WebElement login = driver.findElement(By.name("login"));
		login.click();*/
		//code for signup
		
		/*
		WebElement create = driver.findElement(By.linkText("Create New Account"));
		create.click();
		Thread.sleep(5000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("DK");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("R");
		WebElement username = driver.findElement(By.name("reg_email__"));
		username.sendKeys("8072830083");
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("nopassword");
		WebElement day = driver.findElement(By.cssSelector("select[title='Day']"));
		Select d = new Select(day);
		d.selectByIndex(11);
		WebElement month = driver.findElement(By.cssSelector("select[title='Month']"));
		Select m = new Select(month);
		m.selectByVisibleText("Nov");
		WebElement year = driver.findElement(By.cssSelector("select[title='Year']"));
		Select y = new Select(year);
		y.selectByValue("1992");
		WebElement gender = driver.findElement(By.cssSelector("input[type='radio'][value='2']"));
		gender.click();
		WebElement signup = driver.findElement(By.linkText("Sign Up"));
		signup.click();
		*/
		
		WebElement create = driver.findElementByLinkText("Create New Account");
		create.click();
		Thread.sleep(3000);
		WebElement firstname = driver.findElementByName("firstname");
		firstname.sendKeys("DK");
		WebElement lastname = driver.findElementByName("lastname");
		lastname.sendKeys("R");
		WebElement username = driver.findElementByName("reg_email__");
		username.sendKeys("8072830083");
		WebElement password = driver.findElementByCssSelector("input#password_step_input");
		password.sendKeys("newpassword1234");
		WebElement day = driver.findElement(By.cssSelector("select[title='Day']"));
		Select d = new Select(day);
		d.selectByIndex(11);
		WebElement month = driver.findElementById("month");
		Select m = new Select(month);
		m.selectByVisibleText("Nov");
		WebElement year = driver.findElementById("year");
		Select y = new Select(year);
		y.selectByValue("1992");
		WebElement gender = driver.findElement(By.cssSelector("input[type='radio'][value='2']"));
		gender.click();
		WebElement signup = driver.findElementByName("websubmit");
		signup.click();
		
	}

}
