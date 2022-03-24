import MavenProject.Books;
import MavenProject.Main;
import MavenProject.Shop;
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

}
