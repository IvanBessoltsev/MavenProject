import MavenProject.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopTest {

    @Test
    public void testCountProduct() {
        Shop shop = new Shop();
        int expected = 8;
        int actual = shop.countProduct();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void showProduct() {
        Shop shop = new Shop();
        int expected = Shop.products.length;
        int actual = shop.showByEndDate(1).length;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void showBooksTest() {
        Shop shop = new Shop();
        int expected = 3;
        int actual = shop.showBooks().length;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void showCakesTest() {
        Shop shop = new Shop();
        int expected = 2;
        int actual = shop.showCakes().length;
        Assertions.assertEquals(expected, actual);
    }

}
