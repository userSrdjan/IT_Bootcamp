package proba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegMetode {
	
	public static void klikni(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static void popuni(WebDriver driver, String xpath, String input) {
		driver.findElement(By.xpath(xpath)).sendKeys(input);
	}
	
	public static void izaberiDrop(WebDriver driver, String xpath, String input) {
		Select select = new Select(driver.findElement(By.xpath(xpath)));
		select.selectByVisibleText(input);
	}
	
	public static void izaberiNiz(WebDriver driver, String input) {
		List<WebElement> lst=driver.findElements(By.partialLinkText(input));
		lst.get(1).click();
	}

	
}
