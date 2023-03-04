package com.actitime.qa.stepdefinitions;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.UsersPage;
import com.actitime.qa.util.TestUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateUserStepDefinitions extends TestBase {
    UsersPage usersPage;
    HomePage homePage;
    String sheetName = "Users";
    TestUtil testUtil;


    @Given("^User in the Actitime Users page$")
    public void user_in_the_Actitime_Users_Page() throws Throwable {

        initialization();
        usersPage = new UsersPage();
    }

    @When("^User does something$")
    public void user_does_something() throws Throwable {
    }

    @Then("^Users section should be visible$")
    public void user_enter_something() throws Throwable {
    }

}
