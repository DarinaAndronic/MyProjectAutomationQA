package Tests;

import Pages.Cart.CartPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

import java.util.Calendar;

public class AddToCartTest extends ShareData {

    @Test
    public void test_method(){
        CartPage cartPage=new CartPage(getDriver());
        Integer[] indexes={0,4,6};
        cartPage.selectPhoneItem(indexes);
    }
}
