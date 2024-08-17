package hellocucumber.stepDefination;

import hellocucumber.CucumberHooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginStepDefination {

    public loginStepDefination() {

        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(how = How.CSS, using= "#user-name")
    private WebElement loginInput;
    @Given("I am on login page")
    public void i_am_on_login_page() {
        loginInput.sendKeys("standard_user");
    }
    @When("I am entering the <userName> and <passWord>")
    public void i_am_entering_the_user_name_and_pass_word() {

    }
    @Then("Home page should display")
    public void home_page_should_display() {

    }
}
