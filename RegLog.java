package proba;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Proba3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		try {
			
			driver.manage().window().fullscreen();
				// NewTours
			driver.navigate().to(URL.url);                     // NewTours
				// Register button
			driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();       
				// ime
			driver.findElement(By.xpath("//input[@name='firstName']")).click();             
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Srdjan");
				// prezime
			driver.findElement(By.xpath("//input[@name='lastName']")).click();              
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Vasic");
				// telefon
			driver.findElement(By.xpath("//input[@name='phone']")).click();
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("0651234567");
				// email  (u xpath-u pise user, greska na sajtu)
			driver.findElement(By.xpath("//input[@id='userName']")).click();
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("srdjan.v82@gmail.com");
				// adresa
			driver.findElement(By.xpath("//input[@name='address1']")).click();
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Marsala Tita bb");
				// grad
			driver.findElement(By.xpath("//input[@name='city']")).click();
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Stari Grad");
				// provincija
			driver.findElement(By.xpath("//input[@name='state']")).click();
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Beograd");
				// ptt
			driver.findElement(By.xpath("//input[@name='postalCode']")).click();
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("11000");
				// zemlja
			Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));
			select.selectByVisibleText("SERBIA");
			//driver.findElement(By.xpath("//select[@name='country']")).click();
			//driver.findElement(By.xpath("//select[@name='country']")).sendKeys("SERBIA");
				// user
			driver.findElement(By.xpath("//input[@id='email']")).click();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("srdjan");
				// password
			driver.findElement(By.xpath("//input[@name='password']")).click();
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("asd123");
				// potvrda
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).click();
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("asd123");
				// submit
			driver.findElement(By.xpath("//input[@name='register']")).click();
				// sign-off
			driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).click();
				// home
			driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
				// sign-on
			driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).click();
				// user
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("srdjan");
				// pass
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("asd123");
				// submit
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D:/Screenshots/slika.jpg"));
			
			
			
		} catch(Exception ex) {
			System.out.println(ex.toString());
		} finally {
			driver.quit();
		}
		
		
		
	}

}
