package Task10;

public class FoodProduct extends Product {
    private String expirationDate;

    public FoodProduct(int inventoryNumber, String itemName, double weight, double price, int quantity, String expirationDate){
        super(inventoryNumber, itemName, weight, price, quantity);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
