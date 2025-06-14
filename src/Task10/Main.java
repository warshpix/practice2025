package Task10;

public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addClothingProduct(2121,"Item1", 222, 33.0, 3, 4,"Plastic");
        storage.addClothingProduct(21213,"Item2", 232, 35.0, 5, 2,"Wool");
        storage.addFoodProduct(1212, "Item3", 222322, 25.0, 2,"12.03");
        storage.addFoodProduct(1212, "Item4", 1, 55.0, 8,"22.11");

        storage.showProducts();

    }
}
