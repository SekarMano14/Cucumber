package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement btnCreate;

	@FindBy(name = "firstname")
	private WebElement txtFirstName;

	@FindBy(name = "lastname")
	private WebElement txtLastName;

	@FindBy(name = "websubmit")
	private WebElement btnSignUp;

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getBtnSignUp() {
		return btnSignUp;
	}

}
