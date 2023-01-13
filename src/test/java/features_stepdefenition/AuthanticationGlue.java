package features_stepdefenition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthanticationGlue {
WebDriver driver;

    @Given("user launches browser")
    public void user_launches_browser() {
     driver=new EdgeDriver();
    }
    @When("user enters the url")
    public void user_enters_the_url() {
      driver.get("https://www.amazon.com/");
    }
    @When("user clicked on login link")
    public void user_clicked_on_login_link() {
       driver.findElement(By.xpath(""));
    }
    @Then("user is navigated to my account page")
    public void user_is_navigated_to_my_account_page() {
        Assert.assertEquals(driver.getTitle(),"Amazon Clinic");
    }}

