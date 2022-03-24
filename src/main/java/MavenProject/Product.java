package MavenProject;

public class Product {
    private String name;
    private double price;
    private double weight;
    private int endDate;
    private String category;

    public Product(String name, double price, double weight, int endDate, String category) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.endDate = endDate;
        this.category = category;
    }

    public Product(String name, double price, double weight, String category) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public int getEndDate() {
        return endDate;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}




