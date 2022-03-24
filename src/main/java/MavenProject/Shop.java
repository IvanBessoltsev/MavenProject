package MavenProject;

public class Shop {


    public static Product[] products = {
            new Books("Война и Мир", 125.0, 250, "Книги"),
            new Books("Отцы и дети", 100.0, 175.0, "Книги"),
            new Books("Мертвые души", 133.0, 205.0, "Книги"),
            new Soaps("\"Хозяйственное\"", 30.0, 75.0, "Мыло"),
            new Soaps("\"Дегтярное\"", 50.0, 100.0, "Мыло"),
            new Soaps("\"Земляничное\"", 70, 150.0, "Мыло"),
            new Cakes("\"Медовый\"", 550.0, 850.0, 10, "Торты"),
            new Cakes("\"Наполеон\"", 400.0, 1000.0, 7, "Торты"),
    };

//1) привести массив товаров у которых срок годности не меньше параметра (причём мыло и книги всегда подойдут)


    public int countProduct() {
        int count = 0;
        for (Product p : products) {
            count++;
        }
        return count;
    }


    public Product[] showByEndDate(int date) {
        int count = 0;
        for (Product p : products) {
            if (p.getCategory() != "Торты") {
                count++;
            } else if (p.getEndDate() >= date) {
                count++;
            }
        }
        int j = 0;
        //  System.out.println("Товары удовлетворяющие срок годности");
        Product[] arrayProd = new Product[count];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory() != "Торты") {
                arrayProd[j] = products[i];
                //        System.out.print(arrayProd[j] + ", ");
                j++;
            } else if (products[i].getEndDate() >= date) {
                arrayProd[j] = products[i];
                j++;
            }
        }
        //    System.out.println("\n************************************");
        return arrayProd;
    }


    public String[] showBooks() {
        int count = 0;
        for (Product p : products) {
            if (p.getCategory().equals("Книги")) {
                count++;
            }
        }
        int j = 0;
        //    System.out.println("В наличии в категории \"Книги\"");
        String[] arrayBooks = new String[count];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory().equals("Книги")) {
                arrayBooks[j] =  products[i].getName();
                j++;
            }
        }
        return arrayBooks;
    }


    public Soaps[] showSoaps() {
        int count = 0;
        for (Product p : products) {
            if (p.getCategory().equals("Мыло")) {
                count++;
            }
        }
        int j = 0;
        //    System.out.println("В наличии в категории \"Мыло\"");
        Soaps[] arraySoaps = new Soaps[count];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory().equals("Мыло")) {
                arraySoaps[j] = (Soaps) products[i];
                //    System.out.print(arraySoaps[j] + ", ");
                j++;
            }
        }
        return arraySoaps;
    }

    public Cakes[] showCakes() {
        int count = 0;
        for (Product p : products) {
            if (p.getCategory().equals("Торты")) {
                count++;
            }
        }
        int j = 0;
        //    System.out.println("В наличии в категории \"Торты\"");
        Cakes[] arrayCakes = new Cakes[count];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory().equals("Торты")) {
                arrayCakes[j] = (Cakes) products[i];
                //    System.out.print(arrayCakes[j] + ", ");
                j++;
            }
        }
        return arrayCakes;
    }

}
    
    
    
    
    
    
    
    
    
    
    
















/*
Доработайте или переделайте магазин из прошлого задания так, чтобы у вас теперь класс продукта был родительским классом для разных видов продуктов:
 книг, тортов и мыла. Каждый товар должен помимо названия и цены отвечать на вопрос о своём весе, о сроке годности (для мыла и книг возвращать -1, а для торта должна
  быть возможность задать в конструкторе) и о категории товаров (просто текст “книги”, “мыло”, “торты”). У магазина должны появиться методы:
1) привести массив товаров у которых срок годности не меньше параметра (причём мыло и книги всегда подойдут)
) привести массив всех книг (тип массива должен быть соответствующий - из книг, не из продуктов);
3) привести массив всех тортов;
4) привести массив всех мыл.
 */



