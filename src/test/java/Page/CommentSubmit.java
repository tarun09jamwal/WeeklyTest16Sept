package Page;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CommentSubmit {
    WebDriver driver;

    List<WebElement> allElementDisplay;
    By news = By.xpath("//div[@class='news-head']");
    By product = By.xpath("//a[contains(text(),'nopCommerce new release!')]");
    By addTitle = By.xpath("//input[@id='AddNewComment_CommentTitle']");
    By addComment = By.xpath("//textarea[@id='AddNewComment_CommentText']");
    By newCommentButton = By.xpath("//button[contains(text(),'New comment')]");
    By comfirmNews = By.xpath("//p[contains(text(),'Comment addded')]");

    public CommentSubmit(WebDriver driver) {
        this.driver = driver;
    }

    public void Comment() {
        driver.findElement(news);
        allElementDisplay = driver.findElements(news);
        for (WebElement allElements : allElementDisplay) {
            String StrLinkText = allElements.getText();
            System.out.println(StrLinkText);
        }
        driver.findElement(product).click();
        driver.findElement(addTitle).sendKeys("Verify the comment");
        driver.findElement(addComment).sendKeys("Comment addded");
        driver.findElement(newCommentButton).click();
        String actual = driver.findElement(comfirmNews).getText();
        Assert.isTrue(actual.equals("Comment addded"), "Expected result does not match with actual result");
    }
}
