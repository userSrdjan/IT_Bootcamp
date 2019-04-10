package post;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import login.Login;
import utility.Constant;
import utility.ExcelUtils;

public class Posting {
	
	private static String makePost="//a[contains(text(),'Make a post')]";
	private static String naziv="//input[@placeholder='Naziv']";
	private static String lokacija="//input[@placeholder='Lokacija']";
	private static String writePost="//textarea[@placeholder='Opis']";
	private static String publishPost="//input[@value='Post']";
	
	private static String moreButton="fa-ellipsis-v";
	private static String editButton="fa-edit";
	private static String deleteButton="fa-trash-alt";
	private static String editPost="//div[@class='popupEdit']//textarea[@name='description']";
	private static String publishEdit="//div[@class='popupEdit']//input[@value='Post']";
	
	// make a post
			public static WebElement getMakePost(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(makePost));
				return wb;
			}
			public static void clickMakePost(WebDriver dr) {
				getMakePost(dr).click();
			}
	
	// set name (naziv)
			public static WebElement getNaziv(WebDriver dr) {
				WebElement wb=dr.findElement(By.xpath(naziv));
				return wb;
			}
			public static void clickNaziv(WebDriver dr) {
				getNaziv(dr).click();
			}
			public static void sendKeysNaziv(WebDriver dr, String str) {
				getNaziv(dr).sendKeys(str);
			}
		
	// set location (lokacija)
			public static WebElement getLokacija(WebDriver dr) {
				WebElement wb=dr.findElement(By.xpath(lokacija));
				return wb;
			}
			public static void clickLokacija(WebDriver dr) {
				getLokacija(dr).click();
			}
			public static void sendKeysLokacija(WebDriver dr, String str) {
				getLokacija(dr).sendKeys(str);
			}
		
		
	// write post description
			public static WebElement getWritePost(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(writePost));
				return wb;
			}
			public static void clickWritePost(WebDriver dr) {
				getWritePost(dr).click();
			}
			public static void sendKeysWritePost(WebDriver dr, String str) {
				getWritePost(dr).sendKeys(str);
			}
	
	// publish post
			public static WebElement getPushPost(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(publishPost));
				return wb;
			}
			public static void clickPushPostt(WebDriver dr) {
				getPushPost(dr).click();
			}
		
	// more button (three dots)
			public static void getMore(WebDriver dr) {
				List<WebElement> list=dr.findElements(By.className(moreButton));
				list.get(0).click();
			}
		
	// delete button
			public static void getDelete(WebDriver dr) {
				List<WebElement> list=dr.findElements(By.className(deleteButton));
				list.get(0).click();
			}
		
	// edit button
			public static void getEdit(WebDriver dr) {
				List<WebElement> list=dr.findElements(By.className(editButton));
				list.get(0).click();
			}
	
	// edit description
			public static void editPost(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(editPost));
				wb.click();
				wb.sendKeys("Zaboravio sam i ovo da dodam jfgjhdfjhdfgajhfdmadvmsdhjcf");
			}
			
	// publish edited post
			public static void publishEdit(WebDriver dr) {
				WebElement wb2 = dr.findElement(By.xpath(publishEdit));
				wb2.click();
			}
		
			
			

}
