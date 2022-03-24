package MavenProject;

public class Books extends Product {
    final int endDate = -1;

    public Books(String name, double price, double weight, String category) {
        super(name, price, weight, category);
    }

    @Override
    public int getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Books{" +
                "endDate=" + endDate +
                "} " + super.toString();
    }
}



