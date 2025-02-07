
package e.commerceplatfromusing.java.oop;

// Product class to handle product details
class Product {
    private int id; // Stores product ID
    private String name; // Stores product name
    private double price; // Stores product price
    
    // Constructor to initialize product details
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    // Getter method to return product ID
    public int getId() {
        return id;
    }
    
    // Getter method to return product name
    public String getName() {
        return name;
    }
    
    // Getter method to return product price
    public double getPrice() {
        return price;
    }
    
    // Overriding toString method to display product details
    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: tk " + price;
    }
}
