package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends TestBase  {
    @FindBy(xpath = "//div[text()='New User']")
    private WebElement newUserButton;

    public UsersPage() {
        PageFactory.initElements(driver, this);
    }


    public void clickOnNewUserButton() {
        newUserButton.click();
    }
}
