package register;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Constant;

public class Register {
	
	private static final String firstName="//input[@name='firstname']";
	private static final String lastName="//input[@name='lastname']";
	private static final String userName="//form[@action='processregister.php']//input[@name='username']";
	private static final String email="//input[@name='email']";
	private static final String password="//form[@action='processregister.php']//input[@name='password']";
	private static final String register="//input[@id='blue_btn']";
	
	// first name
			public static WebElement getFirstName(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(firstName));
				return wb;
			}
			public static void clickFirstName(WebDriver dr) {
				getFirstName(dr).click();
			}
			public static void sendKeysFirstName(WebDriver dr, String str) {
				getFirstName(dr).sendKeys(str);
			} 
	
	
	// last name
			public static WebElement getLastName(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(lastName));
				return wb;
			}
			public static void clickLastName(WebDriver dr) {
				getLastName(dr).click();
			}
			public static void sendKeysLastName(WebDriver dr, String str) {
				getLastName(dr).sendKeys(str);
			}
			
			
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
	
	
	// email
			public static WebElement getEmail(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(email));
				return wb;
			}
			public static void clickEmail(WebDriver dr) {
				getEmail(dr).click();
			}
			public static void sendKeysEmail(WebDriver dr, String str) {
				getEmail(dr).sendKeys(str);
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
			
			
	// register button
			public static WebElement getRegister(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(register));
				return wb;
			}
			public static void clickRegister(WebDriver dr) {
				getRegister(dr).click();
			}
	
	
	
}
