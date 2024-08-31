package stepDef;

import Base.config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class signUpStep extends config {
    Faker f=new Faker();
    @Given("Customer in swarovski homepage")
    public void customerAtSwarovskiHomepage() {
        String exp="Swarovski Official | Jewelry, Watches and Crystal Decorations";
        String act=driver.getTitle();
        Assert.assertEquals(act, exp);
    }
    @And("customer enter their email")
    public void customerEnterTheirEmail() {
        String random=f.internet().emailAddress();
        driver.findElement(By.xpath("//*[@id='sacLoginForm-j_username']")).sendKeys(random);

    }

    @And("customer enter their password")
    public void customerEnterTheirPassword() {
        driver.findElement(By.xpath("//*[@id='sc-longRegistrationFormDefinition_password']")).sendKeys("Abed1234");
    }

    @And("customer agrees with terms and conditions")
    public void customerAgreesWithTermsAndConditions() {
        driver.findElement(By.xpath("//*[@id='sc-longRegistrationFormDefinition_newsletter']")).click();

    }

    @When("customer click on Join the Club button")
    public void customerClickOnJoinTheClubButton() {
        driver.findElement(By.xpath("//*[@id='scRegistrationFormConfig']/div[2]/div[4]/button")).click();
    }


    @And("customer clicks on Register button")
    public void customerClicksOnRegisterButton() {

        driver.findElement(By.xpath("/html/body/header/div[4]/div[3]/div[2]/a/span[2]")).click();
    }

    @And("Customer click on continue")
    public void customerClickOnContinue() {

        driver.findElement(By.xpath("//*[@id='sacLoginForm']/button[2]")).click();
    }

    @Then("Customer succesfully able to join the club in swarovski")
    public void customeSuccesfullyAbleToJoinTheClub() {
        String exp="Welcome to Swarovski Club Account";
        String act= driver.findElement(By.xpath("//*[@id='swa-account-profiling']/div[2]/div/div/div/div[1]/div[2]/div/h5")).getText();
        Assert.assertEquals(act, exp);
    }


}
