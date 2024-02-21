package Tests;

import Pages.Cart.CartPage;
import ShareData.ShareData;
import ShareData.Hooks;
import org.testng.annotations.Test;

import java.util.Calendar;

public class AddToCartTest extends Hooks {

    @Test
    public void test_method(){
        CartPage cartPage=new CartPage(getDriver());
        Integer[] indexes={0,4,6};
        cartPage.selectPhoneItem(indexes);
    }
}
