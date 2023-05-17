package com.pageExecution;

import java.io.IOException;

import com.adac.basepack.BaseClassAdac;
import com.adactin.pagefactory.AdactinLoginPageFactory;

public class AdactinLoginPageExecution {
	
	public void to_load_the_Adactin_Login_page() throws IOException {
	    BaseClassAdac.launch();
	    BaseClassAdac.urlLoad(BaseClassAdac.getProp("adactinUrl"));
	}
	
	public void providing_three_credentials(String nme, String pw) {
		AdactinLoginPageFactory alp = new AdactinLoginPageFactory();
		alp.userName.sendKeys(nme);
		alp.passWord.sendKeys(pw);
		alp.signUp.click();
	}
	
	public void to_close_the_Adactin_Login_page() {
		 BaseClassAdac.browserClose();
		}

}
