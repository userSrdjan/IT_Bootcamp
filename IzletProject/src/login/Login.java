package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	private static final String userName="//input[@placeholder='username']";
	private static final String password="//input[@placeholder='password']";
	private static final String login="//input[@value='Log in']";
	private static final String logout="//a[@id='logoutBtn']";
	
	// user name
			public static WebElement getUserName(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(userName));
				return wb;
			}
			public static void clickUserName(WebDriver dr) {
				getUserName(dr).click();
			}
			public static void sendKeysUserName(WebDriver dr, String str) {
				getUserName(dr).sendKeys(str);
			}
		
		
	// password
			public static WebElement getPassword(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(password));
				return wb;
			}
			public static void clickPassword(WebDriver dr) {
				getPassword(dr).click();
			}
			public static void sendKeysPassword(WebDriver dr, String str) {
				getPassword(dr).sendKeys(str);
			}
	
	
	// login button
			public static WebElement getLogin(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(login));
				return wb;
			}
			public static void clickLogin(WebDriver dr) {
				getLogin(dr).click();
			}
	
	
	// logout button
			public static WebElement getLogout(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(logout));
				return wb;
			}
			public static void clickLogout(WebDriver dr) {
				getLogout(dr).click();
			}

}
