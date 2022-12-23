import java.util.HashMap;

public class StoreHouse {
    HashMap<String, Integer> catalog;

    public StoreHouse() {
        catalog = new HashMap<>();
        putIntoCatalog();
    }

    void putIntoCatalog() {
        catalog.put("Milk", 10);
        catalog.put("Bread", 20);
        catalog.put("Sausage", 15);
        catalog.put("Cheese", 18);
    }
    void sellProduct(String str) throws InterruptedException {
        catalog.put(str, catalog.get(str) - 1);
        Thread.sleep(1000);
    }

    ;

    boolean isProductInStoreHouse(String str) throws InterruptedException {
        Thread.sleep(1000);
        return (catalog.get(str) != 0);
    }

    ;

    void transferToDelivery() throws InterruptedException {
        System.out.println("Передача товара со склада в доставку");
        Thread.sleep(1000);
    }

    ;
}