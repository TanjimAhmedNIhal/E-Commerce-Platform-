
package e.commerceplatfromusing.java.oop;

class User {
    private String emailOrPhone; // Stores the email or phone number
    private String username; // Stores the username
    private String password; // Stores the password
    
    // Constructor to initialize user details
    public User(String emailOrPhone, String username, String password) {
        this.emailOrPhone = emailOrPhone;
        this.username = username;
        this.password = password;
    }
    
    // Getter method to return username
    public String getUsername() {
        return username;
    }
    
    // Getter method to return email or phone number
    public String getEmailOrPhone() {
        return emailOrPhone;
    }
    
    // Method to check if the entered password is correct
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}
