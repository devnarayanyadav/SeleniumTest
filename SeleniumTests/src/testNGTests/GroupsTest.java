package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class GroupsTest {
	
	WebDriver d;
  @Test(groups={"A","abc"})
  public void Aa() {
	  System.out.println("Aa group");  
	  
  }
  
  @Test(groups="A")
  public void Aaa() {
	  System.out.println("Aaa group");  
	  
  }
  
  @Test(groups="B")
  public void Bb() {
	  System.out.println("Bb group"); 
	  Assert.assertTrue(true);
	  
  }
  
  @Test(groups="B")
  public void Bbb() {
	  System.out.println("Bbb group");  
	  
  }
  
  @BeforeMethod
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver_win32_New/chromedriver.exe");
	  d= new ChromeDriver();
	  System.out.println("Starting group execution");
  }

  @AfterMethod
  public void afterTest() throws InterruptedException {
	  Thread.sleep(4000);
	  d.close();
  }

}
