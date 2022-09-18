package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DigitalSampleDownload {
    WebDriver driver;
    List<WebElement> allElementDisplay;
    By digitalDownloadProduct = By.partialLinkText("Digital downloads");
    By productTitle = By.xpath("//h2[@class='product-title']");
    By selectProduct = By.partialLinkText("If You Wait (donation)");
    By sampleDownload = By.xpath("//a[contains(text(),'Download sample')]");

    public DigitalSampleDownload(WebDriver driver) {
        this.driver = driver;
    }

    public void Product() {
        driver.findElement(digitalDownloadProduct).click();
        allElementDisplay = driver.findElements(productTitle);
        for (WebElement allElements : allElementDisplay) {
            String StrLinkText = allElements.getText();
            System.out.println(StrLinkText);
        }
        driver.findElement(selectProduct).click();
        driver.findElement(sampleDownload).click();

    }
}
