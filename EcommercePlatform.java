
package e.commerceplatfromusing.java.oop;

import java.util.*;


// Main class for running the e-commerce system

public class EcommercePlatform {
    private static List<User> users = new ArrayList<>(); // List to store registered users
    private static List<Product> products = new ArrayList<>(); // List to store available products
    private static Scanner scanner = new Scanner(System.in); // Scanner for user input
    
    public static void main(String[] args) {
        // Sample products added to product list
        products.add(new Product(1, "Apple MacBook Air (2022)", 118000));
        products.add(new Product(2, "Iphone", 65000));
        products.add(new Product(3, "Apple AirPods 3rd generation with Charging Case", 25190));
        
        System.out.println("Welcome to the E-Commerce Platform!");
        User currentUser = null;
        
        while (currentUser == null) {
            System.out.println("\n1. Register\n2. Login");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            if (option == 1) {
                currentUser = registerUser(); // Register new user
            } else if (option == 2) {
                currentUser = loginUser(); // Login existing user
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
        
        Cart cart = new Cart(); // Create new cart for user
        boolean running = true;
        while (running) {
            // Display menu options
            System.out.println("\n1. View Products\n2. Add to Cart\n3. View Cart\n4. Checkout\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    viewProducts(); // View all available products
                    break;
                case 2:
                    System.out.print("Enter product ID to add: ");
                    int productId = scanner.nextInt();
                    Product product = findProductById(productId);
                    if (product != null) {
                        cart.addProduct(product);
                        System.out.println("Added " + product.getName() + " to cart.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    cart.viewCart(); // View cart contents
                    break;
                case 4:
                    System.out.println("Total Amount: tk " + cart.getTotal());
                    System.out.println("Checkout successful! Thank you for shopping.");
                    
                    System.out.println(""); // for space/gap 
                    
                    running = false; // Exit loop after checkout
                    break;
                case 5:
                    running = false; // Exit program
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
    
    // Method to register a new user
    private static User registerUser() {
        System.out.print("Enter Email or Phone Number: ");
        String emailOrPhone = scanner.nextLine();
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        System.out.println("Verification successful!"); // Simulating verification
        User newUser = new User(emailOrPhone, username, password);
        users.add(newUser);
        System.out.println("Registration successful!");
        return newUser;
    }
    
    // Method to log in an existing user
    private static User loginUser() {
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        for (User user : users) {
            if (user.getUsername().equals(username) && user.checkPassword(password)) {
                System.out.println("Login successful!");
                return user;
            }
        }
        
        System.out.println("Invalid credentials. Try again.");
        return null;
    }
    
    private static void viewProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
    
    private static Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        
        return null;
    }
}
