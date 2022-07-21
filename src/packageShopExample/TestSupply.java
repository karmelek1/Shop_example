package packageShopExample;

import org.junit.Assert;
import org.junit.Test;


import java.io.IOException;

public class TestSupply {


    @Test

    public void testsSupplySum() throws IOException {

        ShopExample shopObject=new ShopExample();
        shopObject.methodGivesResult();
        Assert.assertEquals("It's not equal",172,shopObject.supplyFinal);

    }
}