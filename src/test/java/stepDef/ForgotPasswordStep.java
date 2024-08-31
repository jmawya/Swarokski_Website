package stepDef;

import Base.config;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class ForgotPasswordStep extends config {
    @And("Customer click on forgot password link")
    public void Customerclickonforgotpasswordlink() {

        driver.findElement(By.xpath("//*[@id=\"sacLoginForm\"]/a/span/span")).click();
    }

    @And("Customer click on submit button")
    public void customerClickOnSubmitButton() {

        driver.findElement(By.xpath("//*[@id=\"forgottenPwdForm\"]/div[2]/button")).click();
    }

    @And("Customer at gmail homepage")
    public void customerAtGmailHomePage() {
        driver.get("https://mail.google.com/mail/u/0/#inbox");
    }

    @And("Customer enter their valid email from google sign in page")
    public void customerEnterTheirValidEmailFromGoogleSignInPage() {

        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("jmawya07@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
    }
}
