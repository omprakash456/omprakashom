package com.Omprakash.TechAssessment3;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement loginLink;
	@FindBy(xpath="//input[@class='email']")
	WebElement email;
	@FindBy(xpath="//input[@class='email']")
	WebElement password;
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginButton;
	@FindBy(xpath="//a[text()='omprakashragu@gmail.com']")
	WebElement verifyText;
	@FindBy(xpath="//span[text()='Login was unsuccessful. Please correct the errors and try again.']")
	WebElement errorText;
	@FindBy(xpath="//a[text()='Log out']")
	WebElement logOut;
}