
/**
 * <h1>Product</h1>
 * <p>
 * This class contains the following fields: 
 * product name, product description, product price, maximum quantity allowed to be ordered. 
 * This class contains getters for all its attributes. 
 * This class also has a fully parameterized constructor. 
 * This class overrides Object’s implementation of toString()method.
 * 
 * @author Diem.Vu
 * @version 1.0
 * @since 2021-02-08
 */

public class Product {
    private String name;
    private String description;
    private double price;
    private double maxQualt;

    public Product(String name, String description, double price, double maxQualt) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.maxQualt = maxQualt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaxQualt() {
        return maxQualt;
    }

    public void setMaxQualt(double maxQualt) {
        this.maxQualt = maxQualt;
    }
    
    @Override
    public String toString(){
        return name + ": " + description + " " + price + " " + maxQualt;
    }
    
}
