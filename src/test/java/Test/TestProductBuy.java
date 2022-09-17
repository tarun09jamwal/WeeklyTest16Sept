package Test;

import org.testng.annotations.Test;

public class TestProductBuy extends BaseClass
{
    @Test
    public void BuyItem()
    {
        pageFactory.getProductBuy().BuyProduct();

    }
}
