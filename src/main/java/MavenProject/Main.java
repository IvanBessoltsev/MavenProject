package MavenProject;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Product pr1 = Shop.products[0];
        Product pr2 = Shop.products[1];
        Product pr3 = Shop.products[2];
        Product pr4 = Shop.products[3];
        Product pr5 = Shop.products[4];
        Product pr6 = Shop.products[5];
        Product pr7 = Shop.products[6];
//------------------------------------------------------------------------------------------
        ProductInfo pI = new ProductInfo();
        pI.info(pr2);
        pI.info(pr5);
        pI.info(pr7);
//------------------------------------------------------------------------------------------
        Shop s = new Shop();
        System.out.println("------------------------------------------");
        System.out.println(Arrays.toString(s.showBooks())); // метод для Книг
//        System.out.println(Arrays.toString(s.showSoaps()));
//        System.out.println(Arrays.toString(s.showCakes()));
//        System.out.println(Arrays.toString(s.showByEndDate(8)));


        System.out.println(s.countProduct());

    }
}
