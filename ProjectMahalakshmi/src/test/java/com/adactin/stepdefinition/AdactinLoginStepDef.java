package com.adactin.stepdefinition;

import java.io.IOException;

import com.adac.basepack.BaseClassAdac;
import com.adactin.pagefactory.AdactinLoginPageFactory;
import com.pageExecution.AdactinLoginPageExecution;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinLoginStepDef {
	
	AdactinLoginPageExecution lpe = new AdactinLoginPageExecution();
	@Given("To load the Adactin Login page")
	public void login() throws IOException
	{
	
	lpe.to_load_the_Adactin_Login_page();
	}

	@When("providing three credentials {string}, {string}")
	public void credentials(String nme, String pw)
	{
	lpe.providing_three_credentials(nme, pw);
	}

	
	@Then("To close the Adactin Login page")
	public void close()
	{
		lpe.to_close_the_Adactin_Login_page();
	}
	
}
