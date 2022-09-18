package Test;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestDigitalDownload extends BaseClass
{
    @Test
    public void VerifyDownload() throws IOException {
        pageFactory.getDigitalSampleDownload().Product();
    }
}
