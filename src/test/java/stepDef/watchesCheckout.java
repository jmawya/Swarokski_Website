package stepDef;

import Base.config;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class watchesCheckout extends config {
    @Given("customer at swarovski homepage")
    public void customerAtSwarovskiHomepage() {
        String exp="Swarovski Official | Jewelry, Watches and Crystal Decorations";
        String act=driver.getTitle();
        Assert.assertEquals(act, exp);

    }

    @And("customer click on search icon")
    public void customerClickOnSearchIcon() {
        driver.findElement(By.xpath("/html/body/header/div[6]/div[2]/div[2]/div[1]/a")).click();
    }

    @And("customer type crystal watches in search edit box and click on search icon")
    public void customerTypeCrystalWatchesInSearchEditBoxAndPressEnterFormTheKeybord() {
        driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("crystal watches");
        driver.findElement(By.xpath("/html/body/header/div[6]/div[4]/div/div/form/div/a")).click();
    }

    @And("customer able to see list of search result page")
    public void customerAbleToSeeListOfSearchResultPage() {
    String exp="90 Results found for: \"crystal watches\"";
    String act=driver.findElement(By.xpath("//*[@id=\"swa-plp-main\"]/section[1]/div[2]/h1")).getText();
    Assert.assertEquals(exp, act);
    }

    @And("customer click on Dextera Chain watch item")
    public void customerClickOnDexteraChainwatchItem() {
        WebElement ld=driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[2]/div/a/div[2]/p/span[2]"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(ld));
        ld.click();


    }

    @And("customer click on add to bag button")
    public void customerClickOnAddToBagButton() {

        driver.findElement(By.xpath("//*[@id=\"swa-dialog-wrong-base-store\"]/div/div[2]/div/div[3]/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"addToCartButton\"]/span")).click();

    }

    @And("customer click on view shopping card")
    public void customerClickOnViewShoppingCard() {
        driver.findElement(By.xpath("/html/body/header/div[5]/div[5]/div/div[2]/div[2]/div[2]/div/div/div/a/span")).click();


       //     driver.findElement(By.xpath("//*[@id=\"swa-dialog-wrong-base-store\"]/div/div[2]/div/div[3]/button[2]")).click();



    }

    @And("customer click on checkout button")
    public void customerClickOnCheckoutButton() {
        driver.findElement(By.xpath("//*[@id=\"cartSummary\"]/div[6]/a/span")).click();
    }

    @And("customer enter an valid email address and click on continue button")
    public void customerEnterAnValidEmailAddressandclickoncontinuebutton() {

        driver.findElement(By.xpath("//*[@id=\"guestCheckoutLoginFormDefinition_email\"]")).sendKeys("jmawya07@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"swa-checkout-register\"]/div[1]/button")).click();
    }

    @And("customer enter an valid password and click on login button")
    public void customerEnterAnValidPasswordAndClickOnLoginButton() {

        driver.findElement(By.id("sacLoginForm-j_password")).sendKeys("Test12345");
        driver.findElement(By.xpath("//*[@id=\"sacLoginForm\"]/button[2]")).click();

    }

    @And("customer click on continue button from address page")
    public void customerClickOnContinueButtonFromAddressPage() {

        driver.findElement(By.xpath("  //*[@id=\"swa-main\"]/div[3]/div[1]/div[3]/button")).click();
    }

    @And("customer enter their card number")
    public void customerEnterTheirCardNumber() {
      List<WebElement> d=driver.findElements(By.tagName("iframe"));
      System.out.println(d.size());

      driver.switchTo().frame(0);
      WebElement dd=driver.findElement(By.cssSelector("input[data-fieldtype=\"encryptedCardNumber\"]"));
      WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(500));
      wait.until(ExpectedConditions.visibilityOf(dd));
      dd.sendKeys("4111 1111 1111 1111");

    }

    @And("customer enter their card valid until")
    public void customerEnterTheirCardValidUntil() {

        List<WebElement>ds=driver.findElements(By.tagName("iframe"));
        System.out.println(ds.size());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
       WebElement d= driver.findElement(By.cssSelector("input[placeholder=\"Card valid until*\"]"));
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(500));
       wait.until(ExpectedConditions.visibilityOf(d));
       d.sendKeys("1/29");
    }

    @And("customer enter their security code")
    public void customerEnterTheirSecurityCode() {
        List<WebElement> a=driver.findElements(By.tagName("iframe"));
        System.out.println(a.size());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        WebElement d=driver.findElement(By.cssSelector("input[placeholder=\"Security Code*\"]"));
        WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(500));
        Wait.until(ExpectedConditions.visibilityOf(d));
        d.sendKeys("123");

    }

    @And("customer click on continue button from checkout page")
    public void customerClickOnContinueButtonFromCheckoutPage() {

        WebElement d=driver.findElement(By.xpath("//*[@id=\"swa-main\"]/div[3]/div[1]/div[2]/div/button"));
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(500));
        wait.until(ExpectedConditions.visibilityOf(d));
        d.click();
    }
}
