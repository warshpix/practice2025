package Task10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Storage {
    private ArrayList<Product> productsList = new ArrayList();

    public Storage(){}

    public void addFoodProduct(int inventoryNumber, String itemName, double weight, double price, int quantity, String expirationDate) {
        FoodProduct foodProduct = new FoodProduct(inventoryNumber, itemName, weight, price, quantity, expirationDate);
        productsList.add(foodProduct);
    }

    public void addClothingProduct(int inventoryNumber, String itemName, double weight, double price, int quantity, int size, String material) {
        ClothingProduct clothingProduct = new ClothingProduct(inventoryNumber, itemName, weight, price, quantity, size, material);
        productsList.add(clothingProduct);
    }

    public void sortProductsByWeight(){
        Collections.sort(this.productsList, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getWeight(), p2.getWeight());
            }
        });
    }

    public void showProducts(){
        if(productsList.size()==0){
            System.out.println("Список порожній");
        }
        else {
            sortProductsByWeight();
            for(int i=0; i<productsList.size();i++){
                System.out.println("Назва - " + productsList.get(i).getItemName() + ", ціна - "+ productsList.get(i).getPrice() + ", вага - "+ productsList.get(i).getWeight());
            }
        }
    }

    public void findItem(String name){
        if(productsList.size()==0){
            System.out.println("Список порожній");
        }
        else {
            boolean isFound = false;
            for(int i=0; i<productsList.size();i++){
                if(productsList.get(i).getItemName().equals(name)){
                    System.out.println("Назва - " + productsList.get(i).getItemName() + ", ціна - "+ productsList.get(i).getPrice() + ", вага - "+ productsList.get(i).getWeight());
                    isFound = true;
                }
            }
            if(isFound==false){
                System.out.println("Предмет не знайдено");
            }
        }
    }
}
