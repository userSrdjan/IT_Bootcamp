package post;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Constant;
import utility.ExcelUtils;

public class PostingTest {
	
	// create new post
			public static void newPost (WebDriver dr, int i) throws Exception {
				//ExcelUtils.setExcelFile(Constant.pathTestData+Constant.fileTestData, Constant.sheet2);
				
				Posting.clickMakePost(dr);
				
				Posting.clickNaziv(dr);
				Posting.sendKeysNaziv(dr, ExcelUtils.getCellData(i,1));
				
				Posting.clickLokacija(dr);
				Posting.sendKeysLokacija(dr, ExcelUtils.getCellData(i,2));
				
				Posting.clickWritePost(dr);
				Posting.sendKeysWritePost(dr, ExcelUtils.getCellData(i,0));
				
				Posting.clickPushPostt(dr);
			}
			
	// delete post (n = number of posts you want to delete)
			public static void deletePost (WebDriver dr, int n) throws Exception {
				
				for(int i=1; i<=n; i++) {
					Posting.getMore(dr);
					Posting.getDelete(dr);
				}
			}
			
	// edit last post
			public static void editPost (WebDriver dr) throws Exception {
				Posting.getMore(dr);
				Posting.getEdit(dr);
				Posting.editPost(dr);
				Posting.publishEdit(dr);	
			}
	
}
