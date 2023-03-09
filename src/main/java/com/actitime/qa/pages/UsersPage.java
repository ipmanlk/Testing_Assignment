package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.entities.UserCredential;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPage extends TestBase  {
    @FindBy(xpath = "//div[text()='New User']")
    private WebElement newUserButton;
    @FindBy(xpath = "//input[@id='createUserPanel_firstNameField']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='createUserPanel_lastNameField']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='createUserPanel_emailField']")
    private WebElement emailInput;

    @FindBy(xpath = "//div[text()='Save & Send Invitation']")
    private WebElement saveAndSendInvitationButton;

    @FindBy(xpath = "//div[@class='closeLink']/span[text()='Close']")
    private WebElement closeNewUserPanelButton;

    public UsersPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnNewUserButton() {
        newUserButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        firstNameInput = wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
        lastNameInput = wait.until(ExpectedConditions.elementToBeClickable(lastNameInput));
        emailInput = wait.until(ExpectedConditions.elementToBeClickable(emailInput));
        saveAndSendInvitationButton = wait.until(ExpectedConditions.elementToBeClickable(saveAndSendInvitationButton));
    }

    public void fillUserData(UserCredential userCredential) {
        firstNameInput.sendKeys(userCredential.getFirstName());
        lastNameInput.sendKeys(userCredential.getLastName());
        emailInput.sendKeys(userCredential.getPassword());
    }

    public void clickOnSaveAndSendInvitationButton() {
        saveAndSendInvitationButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        closeNewUserPanelButton = wait.until(ExpectedConditions.elementToBeClickable(closeNewUserPanelButton));
    }

    public void clickOnCloseNewUserPanelButton() {
        closeNewUserPanelButton.click();
    }
}
