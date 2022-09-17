package Page;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductBuy {
    WebDriver driver;
    WebDriverWait wait;
    By Computer = By.linkText("Computers");
    By noteBook = By.linkText("Notebooks");
    By macBook = By.xpath("//a[contains(text(),'Apple MacBook Pro 13-inch')]");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-4']");
    By shoppingCart = By.linkText("Shopping cart");
    By termsofservice = By.xpath("//input[@id='termsofservice']");
    By checkout = By.xpath("//button[@id='checkout']");
    By register = By.xpath("//button[contains(text(),'Register')]");
    By gender = By.xpath("//input[@id='gender-male']");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By dateOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    By date = By.xpath("//option[contains(text(),'15')]");
    By monthOfBirth = By.xpath("//select[@name='DateOfBirthMonth']");
    By month = By.xpath("//option[contains(text(),'May')]");
    By yearOfBirth = By.xpath("//select[@name='DateOfBirthYear']");
    By year = By.xpath("//option[contains(text(),'1991')]");
    By email = By.xpath("//input[@id='Email']");
    By company = By.xpath("//input[@id='Company']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By userRegister = By.xpath("//button[@id='register-button']");
    By buttonContinue = By.xpath("//a[contains(text(),'Continue')]");
    By termCheckbox2 = By.xpath("//input[@id='termsofservice']");
    By checkout2 = By.xpath("//button[@id='checkout']");
    By country = By.xpath("//option[contains(text(),'Albania')]");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zip = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By saveButton = By.xpath("(//button[@name='save'])[1]");
    By continue3 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By continue4 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By continue5 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By confirm2 = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");


    public ProductBuy(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void BuyProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(Computer));
        driver.findElement(Computer).click();
        wait.until(ExpectedConditions.elementToBeClickable(noteBook));
        driver.findElement(noteBook).click();
        driver.findElement(macBook).click();
        driver.findElement(addToCart).click();
        driver.findElement(shoppingCart).click();
        driver.findElement(termsofservice).click();
        driver.findElement(checkout).click();
        driver.findElement(register).click();
        driver.findElement(gender).click();
        driver.findElement(firstName).sendKeys("Tarun");
        driver.findElement(lastName).sendKeys("Jamwal");
        driver.findElement(dateOfBirth).click();
        driver.findElement(date).click();
        driver.findElement(monthOfBirth).click();
        driver.findElement(month).click();
        driver.findElement(yearOfBirth).click();
        driver.findElement(year).click();
        driver.findElement(email).sendKeys("hyukgtyf@gmail.com");
        driver.findElement(company).sendKeys("Infostride");
        driver.findElement(password).sendKeys("Infostride");
        driver.findElement(confirmPassword).sendKeys("Infostride");
        driver.findElement(userRegister).click();
        driver.findElement(buttonContinue).click();
        driver.findElement(termCheckbox2).click();
        driver.findElement(checkout2).click();
        driver.findElement(country).click();
        driver.findElement(city).sendKeys("Mandi");
        driver.findElement(address).sendKeys("My hOme");
        driver.findElement(zip).sendKeys("175001");
        driver.findElement(phoneNumber).sendKeys("8627027210");
        driver.findElement(saveButton).click();
        driver.findElement(continue3).click();
        driver.findElement(continue4).click();
        driver.findElement(continue5).click();
        driver.findElement(confirm2).click();
        String actual = driver.findElement(By.xpath("//h1[contains(text(),'Thank you')]")).getText();
        Assert.isTrue(actual.equals("Thank you"), "Expected result does not match with actual result");
    }
}

