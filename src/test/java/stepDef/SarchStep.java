package stepDef;

import Base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SarchStep extends config {
    @And("Customer click in search icon")
    public void customerClickInSearchIcon() {
        driver.findElement(By.xpath("/html/body/header/div[6]/div[2]/div[2]/div[1]/a/span")).click();
    }


    @When("Customer type five carat diamond ring in search edit box and click enter from search edit box")
    public void customerTypeFiveCaratDiamondRingInSearchEditBoxAndClickEnterFromSearchEditBox() {
        driver.findElement(By.id("swa-search-layer-input")).sendKeys("five carat diamond ring");

        driver.findElement(By.xpath("/html/body/header/div[6]/div[4]/div/div/form/div/a")).click();
    }

    @Then("Customer able to see list of five carat diamond ring in search result page")
    public void customerAbleToSeeListOfDoveShampooInSearchResultPage() {

        String exp="\"five carat diamond ring\"";
        String act= driver.findElement(By.xpath("//*[@id='swa-plp-main']/section[1]/div[2]/h1/span")).getText();
        Assert.assertEquals(act, exp);

        String actual=driver.findElement(By.xpath("//*[@id='swa-plp-main']/section[1]/div[2]/h1")).getText();
        String number=actual.replaceAll("\\D+","");
        int item=Integer.parseInt(number);
        Assert.assertTrue(item> 0);
    }

    @Then("Customer able to see list of  in search result page")
    public void customerAbleToSeeListOfInSearchResultPage() {
        String exp="\"Chroma drop earrings\"";
        String act= driver.findElement(By.xpath("//*[@id='swa-plp-main']/section[1]/div[2]/h1/span")).getText();
        Assert.assertEquals(act, exp);

        String actual=driver.findElement(By.xpath("//*[@id='swa-plp-main']/section[1]/div[2]/h1")).getText();
        String number=actual.replaceAll("\\D+","");
        int item=Integer.parseInt(number);
        Assert.assertTrue(item> 0);
    }
}
