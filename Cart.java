
package e.commerceplatfromusing.java.oop;

  
import java.util.*;


// Cart class to handle shopping cart operations
class Cart {
    private List<Product> products; // List to store products in cart
    
    // Constructor to initialize empty cart
    public Cart() {
        this.products = new ArrayList<>();
    }
    
    // Method to add product to cart
    public void addProduct(Product product) {
        products.add(product);
    }
    
    // Method to remove product from cart
    public void removeProduct(Product product) {
        products.remove(product);
    }
    
    // Method to view all products in cart
    public void viewCart() {
        if (products.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your cart:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
    
    // Method to calculate total price of products in cart
    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

