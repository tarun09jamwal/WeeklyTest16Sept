package Page;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class CommunityPoll {
    WebDriver driver;
    WebDriverWait wait;
    String uniqueEmail;
    By register = By.linkText("Register");
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
    By registerButton = By.xpath("//button[@id='register-button']");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");
    By excillentRadio = By.xpath("//input[@id='pollanswers-1']");
    By voteButton = By.xpath("//button[@id='vote-poll-1']");

    public CommunityPoll(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void RateWebSite() throws IOException {
        String path = System.getProperty("user.dir") + "//src//test//java//TestData//UserDetails.xlsx";
        FileInputStream prop1 = null;
        try {
            prop1 = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop1);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        String userFirstName = sheet.getRow(1).getCell(0).getStringCellValue();
        String userLastName = sheet.getRow(1).getCell(1).getStringCellValue();
        String userEmail = sheet.getRow(1).getCell(2).getStringCellValue();
        String userCompany = sheet.getRow(1).getCell(3).getStringCellValue();
        String userPassword = sheet.getRow(1).getCell(4).getStringCellValue();
        String userConfirmPassword = sheet.getRow(1).getCell(5).getStringCellValue();

        driver.findElement(register).click();
        driver.findElement(gender).click();
        driver.findElement(firstName).sendKeys(userFirstName);
        driver.findElement(lastName).sendKeys(userLastName);
        driver.findElement(dateOfBirth).click();
        driver.findElement(date).click();
        driver.findElement(monthOfBirth).click();
        driver.findElement(month).click();
        driver.findElement(yearOfBirth).click();
        driver.findElement(year).click();
        String randomNumber = String.valueOf((int) (Math.random() * (100 - 50 + 1) + 50));
        uniqueEmail = userFirstName + randomNumber + "@gmail.com";
        driver.findElement(email).sendKeys(uniqueEmail);
        driver.findElement(company).sendKeys(userCompany);
        driver.findElement(password).sendKeys(userPassword);
        driver.findElement(confirmPassword).sendKeys(userConfirmPassword);
        driver.findElement(registerButton).click();
        driver.findElement(continueButton).click();
        driver.findElement(excillentRadio).click();
        driver.findElement(voteButton).click();
    }
}
