package Test;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestCommunityPoll extends BaseClass
{
    @Test
    public void VerifyRating() throws IOException {
        pageFactory.getCommunityPoll().RateWebSite();
    }
}
