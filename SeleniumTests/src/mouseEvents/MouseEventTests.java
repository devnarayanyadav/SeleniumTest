package mouseEvents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class MouseEventTests {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver_win32_New/chromedriver.exe");
WebDriver d = new ChromeDriver();
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

GoogleHome_PageFactory gHomePage = PageFactory.initElements(d, GoogleHome_PageFactory.class);
d.get("https://www.google.com");
Actions builder = new Actions(d);
Thread.sleep(2000);
//WebElement e = d.findElement(By.xpath(".//a[@aria-label='Search by voice']/span"));
/*//Action act = 
builder.moveToElement(e).build();

act.perform();*/

GoogleHome_PageFactory p =new GoogleHome_PageFactory(d);
Action act;
builder.moveToElement(p.voiceIcon).build().perform();
Thread.sleep(2000);
builder.moveToElement(gHomePage.voiceIcon).contextClick().build().perform();





	}

}
