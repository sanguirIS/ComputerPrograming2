public class Item {

    // Attributes
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private double amountDue;

    // Constructor (optional)
    public Item(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        calculateTotalCost(); // Calculate amountDue upon object creation (optional)
    }

    // Methods
    public void setItemName(String newItemName) {
        this.itemName = newItemName;
    }

    public void setTotalCost(int quantity, double price) {
        this.itemQuantity = quantity;
        this.itemPrice = price;
        calculateTotalCost();
    }

    private void calculateTotalCost() {
        this.amountDue = itemPrice * itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalCost() {
        return amountDue;
    }

    // Additional methods (optional)
    public void readInput() {
        // Implement logic to read user input for item name, quantity, and price
        // Scanner can be used to get user input
    }

    public void writeOutput() {
        // Implement logic to display item information and total amount due
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + itemQuantity);
        System.out.println("Price: $" + String.format("%.2f", itemPrice)); // Format price to two decimal places
        System.out.println("Total Due: $" + String.format("%.2f", amountDue));
    }
}