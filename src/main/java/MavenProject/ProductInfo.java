package MavenProject;

public class ProductInfo {

    public static void info(Product product) {
        System.out.println(" Категория: *** " + product.getCategory() +" ***"+
                "\nНазвание: " + product.getName() +
                "\nЦена: " + product.getPrice() + " руб. " +
                "\nВес товара составляет " + product.getWeight() +
                ". \nСрок годности " + product.getEndDate() + " дней." );
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}
