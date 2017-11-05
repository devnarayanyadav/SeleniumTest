package mouseEvents;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class GoogleHome_PageFactory {
	WebDriver driver;
	@FindBy(xpath=".//a[@aria-label='Search by voice']/span") public WebElement voiceIcon;
	public GoogleHome_PageFactory(WebDriver d){
		PageFactory.initElements(d,this);

	}


}
