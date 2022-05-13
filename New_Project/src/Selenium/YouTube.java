package Selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTube 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../New_Project/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		//Options opt = driver.manage();
		//Window win = opt.window();
		//win.maximize();
		driver.manage().window().maximize();
		List<WebElement> all = driver.findElementsById("video-title");
		System.out.println("Total videos "+all.size());
		for(WebElement element : all)
		{
			element.click();
			Thread.sleep(4000);
			driver.navigate().back();
		}
		
		//-----------------------------------------------------------
		/*WebElement video1 = driver.findElementByXPath("(//*[@*='video-title'])[1]");
		WebElement video2 = driver.findElementByXPath("(//*[@*='video-title'])[2]");
		WebElement video3 = driver.findElementByXPath("(//*[@*='video-title'])[3]");
		WebElement video4 = driver.findElementByXPath("(//*[@*='video-title'])[4]");
		WebElement video5 = driver.findElementByXPath("(//*[@*='video-title'])[5]");
		WebElement video6 = driver.findElementByXPath("(//*[@*='video-title'])[6]");
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(video1).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).click(video2).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).click(video3).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).click(video4).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).click(video5).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).click(video6).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		System.out.println("URL before switching tab is ");
		System.out.println(driver.getCurrentUrl());
		String firsttab = driver.getWindowHandle();
		Set<String> alltabs = driver.getWindowHandles();
		System.out.println("Total tabs-------"+alltabs.size());
		int count = 0;
		for(String s : alltabs)
		{
			count = count+1;
			if(count==6)
			{
				driver.switchTo().window(s);
				break;
			}
		}
		
		System.out.println("URL of the 3rd tab is ");
		System.out.println(driver.getCurrentUrl());*/
		//-------------------------------------------------------------
		//System.out.println("URL after switching tab is ");
		//System.out.println(driver.getCurrentUrl());
		
		//driver.switchTo().window(firsttab);
		//System.out.println("Finally URL is ");
		//System.out.println(driver.getCurrentUrl());
	}

}
