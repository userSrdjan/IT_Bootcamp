package login;

import org.openqa.selenium.WebDriver;

import register.RegisterTest;
import utility.Constant;
import utility.ExcelUtils;

public class LoginTest {
	
	// login every user after registration and validate login
			public static void login(WebDriver dr, int i) throws Exception {
				Login.clickUserName(dr);
				Login.sendKeysUserName(dr, ExcelUtils.getCellData(i, 2));
				
				Login.clickPassword(dr);
				Login.sendKeysPassword(dr, ExcelUtils.getCellData(i, 4));
				
				Login.clickLogin(dr);
				
				if (dr.getCurrentUrl().equals("http://localhost/izlet/dashboard.php")) {
					ExcelUtils.setCellData("passed", i, 5);
					Login.clickLogout(dr);
				}
				else {
					ExcelUtils.setCellData("fail", i, 5);
				}
			}
	
	// login single user from Data table (i = row number)
			public static void loginSingle(WebDriver dr, int i) throws Exception {
				Login.clickUserName(dr);
				Login.sendKeysUserName(dr, ExcelUtils.getCellData(i, 2));
				
				Login.clickPassword(dr);
				Login.sendKeysPassword(dr, ExcelUtils.getCellData(i, 4));
				
				Login.clickLogin(dr);
				
			}
	
}
