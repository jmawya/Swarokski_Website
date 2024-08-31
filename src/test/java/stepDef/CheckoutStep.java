package stepDef;

import Base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


public class CheckoutStep extends config {
    @And("Customer click on Chroma drop earrings item")
    public void customerClickOnChromadropearringsItem() {

        driver.findElement(By.xpath("//*[@id='js-product-list']/div[1]/div/a/div[2]/p/span[1]")).click();
    }

    @When("Customer type Chroma drop earrings in search edit box and click enter from search edit box")
    public void customerTypeChromaDropEarringsInSearchEditBoxAndClickEnterFromSearchEditBox() {
        driver.findElement(By.id("swa-search-layer-input")).sendKeys("Chroma drop earrings");
        driver.findElement(By.xpath("/html/body/header/div[6]/div[4]/div/div/form/div/a")).click();
    }

    @And("Customer on add to bag button")
    public void customerOnAddToBagButton() {

        driver.findElement(By.xpath("//*[@id='swa-dialog-wrong-base-store']/div/div[2]/div/div[3]/button[2]")).click();
        driver.findElement(By.id("addToCartButton")).click();

    }
    @And("Customer click on shoping bag link")
    public void customerClickOnShopingBagLink() {

        driver.findElement(By.xpath("/html/body/header/div[5]/div[2]/div[2]/div[2]/a/span[1]")).click();


    }

    @And("Customer click on  checkout")
    public void customerClickOnCheckout() {

        driver.findElement(By.xpath("//*[@id='cartSummary']/div[6]/a")).click();

    }

    @And("Customer enter FirstName")
    public void customerEnterFirstName() {
        driver.findElement(By.xpath("//*[@id='checkoutAddressStepDeliveryAddressFormDefinition_firstName']")).sendKeys("Jannatul");
    }

    @And("Customer enter lastName")
    public void customerEnterLastName() {
        driver.findElement(By.xpath("//*[@id='checkoutAddressStepDeliveryAddressFormDefinition_lastName']")).sendKeys("Jannat");
    }

    @And("Customer enter Telephone number")
    public void customerEnterTelephoneNumber() {
        driver.findElement(By.xpath("//*[@id='checkoutAddressStepDeliveryAddressFormDefinition_phone']")).sendKeys("6465776910");
    }

    @And("Customer enter their address")
    public void customerEnterTheirAddress() {
        driver.findElement(By.xpath("//*[@id='us-checkoutAddressStepDeliveryAddressFormConfig']/div[7]/div/input")).sendKeys("3701 New York St West Covina California 91792-2520");
    }

    @When("Customer click on continue button")
    public void customerClickOnContinueButton() {

        driver.findElement(By.xpath("//*[@id='swa-checkout-register']/div[1]/button")).click();
    }

    @When("Customer click on continue button from checkout page")
    public void customerClickOnContinueButtonFromCheckoutPage() {

        driver.findElement(By.xpath("//*[@id=\"swa-main\"]/div[3]/div[1]/div[3]/button")).click();

    }
    @And("Customer enter valid card number")
    public void customerEnterValidCardNumber(){
        driver.findElement(By.xpath("//*[@id=\"card-container\"]/div/div/div[2]/div[1]/div[1]/div[2]/span")).sendKeys("5262636243841148");

    }

    @And("Customer enter card expire date")
    public void customerEnterCardExpireDate() {
        driver.findElement(By.xpath("//*[@id='adyen-checkout-encryptedExpiryDate-1724259560001']")).sendKeys("10/27");
    }

    @And("Customer enter valid security code")
    public void customerEnterValidSecurityCode() {
        driver.findElement(By.xpath("//*[@id='adyen-checkout-encryptedSecurityCode-1724259560002']]")).sendKeys("658");
    }

    @And("Customer enter card holder name")
    public void customerEnterCardHolderName() {
        driver.findElement(By.xpath("//*[@id='adyen-checkout-holderName-1724259560003']")).sendKeys("Zachary Emmerich");
    }



    @And("customer enter valid email")
    public void customerEnterValidEmail() {

        driver.findElement(By.xpath("//*[@id='guestCheckoutLoginFormDefinition_email']")).sendKeys("jmawya07@gmail.com");
    }


}
