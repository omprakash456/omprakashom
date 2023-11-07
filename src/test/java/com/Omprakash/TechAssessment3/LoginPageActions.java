package com.Omprakash.TechAssessment3;


import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {
	LoginPageLocators LogLoc ;
	
	public LoginPageActions() {
		LogLoc = new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), LogLoc);
	}
	public void clickLogout() {
		LogLoc.logOut.click();
	}
	public void clicklogin() {
		LogLoc.loginLink.click();
	}
	public void setEmail(String email) {
		LogLoc.email.sendKeys(email);
	}
	public void setPassword(String password) {
		LogLoc.password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		LogLoc.loginButton.click();
	}
	public String getVerifyText() {
		return LogLoc.verifyText.getText();
	}
	public String getErrorText() {
		return LogLoc.errorText.getText();
	}
	public void loginAccount(String email, String password) {
		setEmail(email);
		setPassword(password);
	}
}
