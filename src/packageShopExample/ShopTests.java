package packageShopExample;

import org.junit.Assert;
import org.junit.Test;


import java.io.IOException;

public class ShopTests {



    @Test
    public void resultTest() throws IOException {

        ShopExample shopObject=new ShopExample();
        shopObject.methodGivesResult();
        Assert.assertSame(60,shopObject.result);
    }


    @Test
    public void buySumTest() throws IOException{

        ShopExample shopObject=new ShopExample();
        shopObject.methodGivesResult();
        Assert.assertSame(112,shopObject.buyFinal);

    }
}