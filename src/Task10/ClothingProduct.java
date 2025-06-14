package Task10;

public class ClothingProduct extends Product{
    private int size;
    private String material;

    public ClothingProduct(int inventoryNumber, String itemName, double weight, double price, int quantity, int size, String material){
        super(inventoryNumber, itemName, weight, price, quantity);
        this.size=size;
        this.material=material;
    }

    public int getSize(){
        return size;
    }

    public String getMaterial(){
        return material;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setMaterial(String material){
        this.material = material;
    }
}
