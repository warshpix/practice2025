package Task10;

public class Product {
    private int inventoryNumber;
    private String itemName;
    private double weight;
    private double price;
    private int quantity;

    public Product(int inventoryNumber, String itemName, double weight, double price, int quantity){
        this.inventoryNumber = inventoryNumber;
        this.itemName = itemName;
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public String getItemName(){
        return itemName;
    }

    public double getWeight(){
        return weight;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
