package MavenProject;

public class Soaps extends Product {
    final int endDate = -1;

    public Soaps(String name, double price, double weight, String category) {
        super(name, price, weight, category);
    }

    @Override
    public int getEndDate() {
        return endDate;
    }


    }





