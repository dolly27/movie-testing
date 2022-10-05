package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestVagrant
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Wikipedia Pushpa:The Rise");
		ele.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//h3[text()='Pushpa: The Rise - Wikipedia'])[1]")).click();
		WebElement ele1 =driver.findElement(By.xpath("(//li[contains(text(),'2021')])[1]"));
		String a = ele1.getText();
	    System.out.println("Release date of PushPa:The rise as per Wikipidia:" +a);
	    WebElement ele2 = driver.findElement(By.xpath("//td[text()='India']"));
	    String b = ele2.getText();
	    System.out.println("Release country of Pushpa:The rise as per Wikipedia :" + b);
	    
	    driver.navigate().back();
	    WebElement ele4 = driver.findElement(By.name("q"));
	    ele4.clear();
	    ele4.sendKeys("imdb pushpa : the rise");
	    ele4.sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("(//h3[contains(text(),'IMDb')])[1]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'December ')]")).click();
	    WebElement ele5 = driver.findElement(By.xpath("(//td[contains(text(),'December ')])[6]"));
		String c = ele5.getText();
		System.out.println("Release date of PushPa:The rise as per IMDB:" +c);
		WebElement ele6 = driver.findElement(By.linkText("India"));
		String d = ele6.getText();
		System.out.println("Release country of Pushpa:The rise as per IMDB :" + d);
		
	    
		if(a.equals(c)&& (b.equals(d)))
		{
			System.out.println("Details Available at IMDB and Wikipedia is Exactly same");
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fails");
		}
		driver.close();
		 
		
	}
}

