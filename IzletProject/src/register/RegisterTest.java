package register;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import login.Login;
import login.LoginTest;
import post.Posting;
import utility.Constant;
import utility.ExcelUtils;

public class RegisterTest {
	
	// register every user from Data table
			public static void fillForm(WebDriver dr, int i) throws Exception {
				Register.clickFirstName(dr);
				Register.sendKeysFirstName(dr, ExcelUtils.getCellData(i, 0));
				
				Register.clickLastName(dr);
				Register.sendKeysLastName(dr, ExcelUtils.getCellData(i, 1));
				
				Register.clickUserName(dr);
				Register.sendKeysUserName(dr, ExcelUtils.getCellData(i, 2));
				
				Register.clickEmail(dr);
				Register.sendKeysEmail(dr, ExcelUtils.getCellData(i, 3));
				
				Register.clickPassword(dr);
				Register.sendKeysPassword(dr, ExcelUtils.getCellData(i, 4));
				
				Register.clickRegister(dr);
					
			}
	
	// register single user from users input
			public static void fillFormManual() throws Exception {
				Scanner sc=new Scanner(System.in);
			
			// create variables for users input
				System.out.println("Za registraciju je potrebno da unesete sledece podatke:"+"\n"+"Ime: ");
				String firstName=sc.nextLine();
				
				System.out.println("Prezime: ");
				String lastName=sc.nextLine();
				
				System.out.println("Korisnicko ime: ");
				String userName=sc.nextLine();
				
				System.out.println("Email(*@*): ");
				String email=sc.nextLine();
				
				System.out.println("Lozinka: ");
				String password=sc.nextLine();
				
				System.out.println("Post koji zelite da postavite(naziv, lokacija, tekst)"+"\n"+"Naziv: ");
				String naziv=sc.nextLine();
				
				System.out.println("Lokacija: ");
				String lokacija=sc.nextLine();
				
				System.out.println("Tekst: ");
				String tekst=sc.nextLine();
			
			// starting webdriver
				WebDriver dr=new ChromeDriver();
				dr.manage().window().fullscreen();
				dr.get(Constant.url);
				
			// fill register form with users input	
				Register.clickFirstName(dr);
				Register.sendKeysFirstName(dr, firstName);
				
				Register.clickLastName(dr);
				Register.sendKeysLastName(dr, lastName);
				
				Register.clickUserName(dr);
				Register.sendKeysUserName(dr, userName);
				
				Register.clickEmail(dr);
				Register.sendKeysEmail(dr, email);
				
				Register.clickPassword(dr);
				Register.sendKeysPassword(dr, password);
				
				Register.clickRegister(dr);
			
			// login user
				Login.clickUserName(dr);
				Login.sendKeysUserName(dr, userName);
				
				Login.clickPassword(dr);
				Login.sendKeysPassword(dr, password);
				
				Login.clickLogin(dr);
			
			// publishing post with users input
				Posting.clickMakePost(dr);
				
				Posting.clickNaziv(dr);
				Posting.sendKeysNaziv(dr, naziv);
				
				Posting.clickLokacija(dr);
				Posting.sendKeysLokacija(dr, lokacija);
				
				Posting.clickWritePost(dr);
				Posting.sendKeysWritePost(dr, tekst);
				
				Posting.clickPushPostt(dr);
				
				Thread.sleep(2000);
			
			// input edit post	
				
				System.out.println("Unesite izmenu za opis: ");
				String izmena=sc.nextLine();
				
				Thread.sleep(2000);
				
				Posting.getMore(dr);
				Posting.getEdit(dr);
				
				WebElement wb = dr.findElement(By.xpath("//div[@class='popupEdit']//textarea[@name='description']"));
				wb.click();
				wb.sendKeys(" "+izmena);
				
				Posting.publishEdit(dr);
				Thread.sleep(2000);
				
				Login.clickLogout(dr);
			// close webdriver	
				dr.quit();
			}
	
	
	
}
