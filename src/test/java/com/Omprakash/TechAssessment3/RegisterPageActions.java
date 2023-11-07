package com.Omprakash.TechAssessment3;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

public class RegisterPageActions {
	RegisterPageLocators Regloc;
	
	RegisterPageActions(){
		Regloc = new RegisterPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), Regloc);
	}
	
	public void clickRegister() {
		Regloc.register.click();
	}
	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			Regloc.genderMale.click();
		}else {
			Regloc.genderFeMale.click();
		}
	}
	public void setFirstname(String firstname) {
		Regloc.firstName.sendKeys(firstname);
	}
	public void setLastname(String lastname) {
		Regloc.lastName.sendKeys(lastname);
	}
	public void setEmail(String email) {
		Regloc.eMail.sendKeys(email);
	}
	public void setPassword(String password) {
		Regloc.passWord.sendKeys(password);
	}
	public void setCPassword(String cpassword) {
		Regloc.cPassWord.sendKeys(cpassword);
	}
	public void clickRegisterButton() {
		Regloc.registerButton.click();
	}
	public String getVerifyText1() {
		return Regloc.verifyText.getText();
	}
	public void clicklogout() {
		Regloc.logOut.click();
	}
    public void registerAccount(String gender,String firstname,String lastname,String email,String password,String cpassword) {
		setGender(gender);
		setFirstname(firstname);
		setLastname(lastname);
		setEmail(email);
		setPassword(password);
		setCPassword(cpassword);
	}

	public void clickLogout() {
		// TODO Auto-generated method stub
		
	}

	public List<Map<String, String>> getVerifyText() {
		// TODO Auto-generated method stub
		return null;
	}
}
