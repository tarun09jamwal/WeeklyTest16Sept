package Page;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class PageFactory
{
    WebDriver driver;
    ProductBuy productBuy;
    CommunityPoll communityPoll;
    ResgisterAndSignOutUser resgisterAndSignOutUser;
    public PageFactory(WebDriver driver)
    {
        this.driver = driver;
    }
    public ProductBuy getProductBuy()
    {
        if (productBuy == null) {
            productBuy = new ProductBuy(driver);
        }
        return productBuy;
    }
    public CommunityPoll getCommunityPoll()
    {
        if (communityPoll == null) {
            communityPoll = new CommunityPoll(driver);
        }
        return communityPoll;
    }
    public ResgisterAndSignOutUser getResgisterAndSignOutUser()
    {
        if (resgisterAndSignOutUser == null) {
            resgisterAndSignOutUser = new ResgisterAndSignOutUser(driver);
        }
        return resgisterAndSignOutUser;
    }

}
