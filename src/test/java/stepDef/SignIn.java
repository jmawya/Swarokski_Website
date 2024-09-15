package stepDef;

import Base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SignIn extends config {


    @And("Customer enter their valid email log in page")
    public void customerEnterTheirValidEmailLogInPage() {
        driver.findElement(By.xpath("//*[@id='sacLoginForm-j_username']")).sendKeys("pogduc@cggup.com");
    }

    @And("Customer enter valid password in log in page")
    public void customerEnterValidPasswordInLogInPage() {

        driver.findElement(By.xpath("//*[@id='sacLoginForm-j_password']")).sendKeys("Test12345");

    }

    @When("Customer click on sign in button")
    public void customerClickOnSignInButton() {

        driver.findElement(By.xpath("//*[@id='sacLoginForm']/button[2]")).click();
    }

    @Then("Customer successfully able to Log in swarovski")
    public void customerSuccessfullyAbleToLogInAtLGParts() {

        String exp="My Account";
        String act=driver.findElement(By.xpath("//*[@id='swa-main']/section/div[3]/h1")).getText();
        Assert.assertEquals(act, exp);
    }

    @And("Customer enter invalid password in log in page")
    public void customerEnterInvalidPasswordInLogInPage() {
        driver.findElement(By.xpath("//*[@id='sacLoginForm-j_password']")).sendKeys("Test745");
    }

    @Then("Customer is not able to Log in  at swarovski")
    public void customerIsNotAbleToLogInAtSwarovski() {
        String exp="Your email address or password was incorrect.";
        String act=driver.findElement(By.xpath("//*[@id='globalMessagesHolder']/div/div/div/div[2]")).getText();
        Assert.assertEquals(act, exp);
    }

    @And("Customer enter their invalid email in log in page")
    public void customerEnterTheirInvalidEmailInLogInPage() {
        driver.findElement(By.xpath("//*[@id='sacLoginForm-j_username']")).sendKeys("jmawya07gmail.com");
    }

    @Then("Customer is not able to Log in  at swarovski with invalid email")
    public void customerIsNotAbleToLogInAtSwarovskiWithInvalidEmail() {
        String exp="Invalid email address";
        String act=driver.findElement(By.xpath("//*[@id='sacLoginForm']/div[2]/div[1]/div/div/small[2]")).getText();
        Assert.assertEquals(act, exp);
    }
}
