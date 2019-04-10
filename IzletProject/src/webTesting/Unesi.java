package webTesting;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import login.Login;
import login.LoginTest;
import post.Posting;
import post.PostingTest;
import register.RegisterTest;
import utility.Constant;
import utility.ExcelUtils;

public class Unesi {

	// method for selecting manual or automation input(from Data table)
			public static void staHoces() throws Exception {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Kako zelite da unesete podatke?"+"\n"+"Za automatski unos pritisnite 1."+"\n"+"Ako zelite sami da unesete podatke pritisnite 9.");
			
			// select one of two options (1 or 9)
				while(true) {
					String a=sc.nextLine();
						
					switch(a) {
				// automation input
					case "1":
						WebDriver dr=new ChromeDriver();
						
						dr.manage().window().fullscreen();
						dr.get(Constant.url);
					// set excel file Data.xls
						ExcelUtils.setExcelFile(Constant.pathTestData+Constant.fileTestData, Constant.sheet1);
					// register every user from table Data	
						for(int j=1; j<=ExcelUtils.getWorkSheet(Constant.sheet1).getLastRowNum(); j++) {
							RegisterTest.fillForm(dr, j);
							LoginTest.login(dr, j);
							
							System.out.print((j+1)+": "+ExcelUtils.getCellData(j, 5)+"\n");
						}
						
						LoginTest.loginSingle(dr, 3);
					
					// set "tekst" sheet for posting	
						ExcelUtils.setExcelFile(Constant.pathTestData+Constant.fileTestData, Constant.sheet2);
					// post every description from table (100)
						for(int i=1; i<=ExcelUtils.getWorkSheet(Constant.sheet2).getLastRowNum(); i++) {
							PostingTest.newPost(dr, i);
						}
					
					// delete last post(s), in this case 2
						PostingTest.deletePost(dr, 2);
						
					// edit last post
						PostingTest.editPost(dr);
						
						Login.clickLogout(dr);
						
						dr.quit();
						break;
					
				// manual input	
					case "9":
						
						RegisterTest.fillFormManual();
						
						
						break;
				// if user selects another option, that is NOT offered :-)	
					default:
						System.out.println("1 ili 9 bre!!!!!!");
						continue;
					}
					break;
				}
				
				
			}
	
	
	
}
