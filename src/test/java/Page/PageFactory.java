package Page;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    ProductBuy productBuy;
    CommunityPoll communityPoll;
    ResgisterAndSignOutUser resgisterAndSignOutUser;
    DigitalSampleDownload digitalSampleDownload;
    CommentSubmit commentSubmit;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public ProductBuy getProductBuy() {
        if (productBuy == null) {
            productBuy = new ProductBuy(driver);
        }
        return productBuy;
    }

    public CommunityPoll getCommunityPoll() {
        if (communityPoll == null) {
            communityPoll = new CommunityPoll(driver);
        }
        return communityPoll;
    }

    public ResgisterAndSignOutUser getResgisterAndSignOutUser() {
        if (resgisterAndSignOutUser == null) {
            resgisterAndSignOutUser = new ResgisterAndSignOutUser(driver);
        }
        return resgisterAndSignOutUser;
    }

    public DigitalSampleDownload getDigitalSampleDownload() {
        if (digitalSampleDownload == null) {
            digitalSampleDownload = new DigitalSampleDownload(driver);
        }
        return digitalSampleDownload;

    }

    public CommentSubmit getCommentSubmit() {
        if (commentSubmit == null) {
            commentSubmit = new CommentSubmit(driver);
        }
        return commentSubmit;

    }
}