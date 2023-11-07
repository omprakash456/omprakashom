package com.Omprakash.TechAssessment3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class RegisterPageLocators {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement genderMale;
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement genderFeMale;
	@FindBy(xpath="//input[@name='FirstName']")
	WebElement firstName;
	@FindBy(xpath="//input[@name='LastName']")
	WebElement lastName;
	@FindBy(xpath="//input[@name='Email']")
	WebElement eMail;
	@FindBy(xpath="//input[@name='Password']")
	WebElement passWord;
    @FindBy(xpath="//input[@name='ConfirmPassword']")
	WebElement cPassWord;
	@FindBy(xpath="//input[@name='register-button']")
	WebElement registerClick;
	@FindBy(id="//input[@name='register-button']")
	WebElement registerButton;
	@FindBy(xpath="//div[@class='result']")
	WebElement verifyText;
	@FindBy(xpath="//a[text()='Log out']")
	WebElement logOut;
}