package proba;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registracija {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		try {
			
			driver.manage().window().fullscreen();
				
			driver.navigate().to(Sajtovi.url);                     // NewTours   http://newtours.demoaut.com/
			
			RegMetode.klikni(driver, "//a[contains(text(),'REGISTER')]");                   // Registracija
			
			RegMetode.popuni(driver, "//input[@name='firstName']","Srdjan");                // ime
			
			RegMetode.popuni(driver, "//input[@name='lastName']", "Vasic");                 // prezime
			
			RegMetode.popuni(driver, "//input[@name='phone']", "123456789");                // telefon
			
			RegMetode.popuni(driver, "//input[@id='userName']", "mile@mile.com");           // email
			
			RegMetode.popuni(driver, "//input[@name='address1']", "Miletov Bulevar bb");    // adresa
			
			RegMetode.popuni(driver, "//input[@name='city']", "Stari Grad");                // opstina
			 
			RegMetode.popuni(driver, "//input[@name='state']", "Beograd");                  // grad
			
			RegMetode.popuni(driver, "//input[@name='postalCode']", "11000");               // ptt br
			
			RegMetode.izaberiDrop(driver, "//select[@name='country']", "SERBIA");           // drzava
			
			RegMetode.popuni(driver, "//input[@id='email']", "mileCar");                    // korisnik
			
			RegMetode.popuni(driver, "//input[@name='password']", "mile123");               // lozinka
			
			RegMetode.popuni(driver, "//input[@name='confirmPassword']", "mile123");        // lozinka
			
			RegMetode.klikni(driver, "//input[@name='register']");                          // posalji
			
			RegMetode.klikni(driver, "//a[contains(text(),'SIGN-OFF')]");                   // odjava
			
			RegMetode.klikni(driver, "//a[contains(text(),'Home')]");                       // pocetna
			
			RegMetode.klikni(driver, "//a[contains(text(),'SIGN-ON')]");                    // prijava
			
			RegMetode.popuni(driver, "//input[@name='userName']", "mileCar");               // korisnik
			
			RegMetode.popuni(driver, "//input[@name='password']", "mile123");               // lozinka
			
			RegMetode.klikni(driver, "//input[@value='Login']");                            // posalji
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D:/Screenshots/slika.jpg"));
			
			
			
		} catch(Exception ex) {
			System.out.println(ex.toString());
		} finally {
			driver.quit();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
