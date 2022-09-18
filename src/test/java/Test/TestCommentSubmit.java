package Test;

import org.testng.annotations.Test;

public class TestCommentSubmit extends BaseClass
{
    @Test
    public void VerifyTest()
    {
        pageFactory.getCommentSubmit().Comment();
    }
}
