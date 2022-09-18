package Test;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestRegisterAndSingOutUser extends BaseClass
{
    @Test
    public void VerifyRating() throws IOException {
        pageFactory.getResgisterAndSignOutUser().RegisterUser();
    }
}
