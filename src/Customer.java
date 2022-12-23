import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Customer {
    String product;
    CreditCard card;
    String delieveryData;

    public Customer() {
        card = new CreditCard();
    }

    public String getProduct() {
        return product;
    }

    void chooseProduct() throws InterruptedException {
        System.out.println("Выбор товара покупателем");
        ArrayList<String> catalog = new ArrayList<>();
        catalog.add("Milk");
        catalog.add("Bread");
        catalog.add("Sausage");
        catalog.add("Cheese");

        Random random = new Random();
        product = catalog.get(random.nextInt(3));
        Thread.sleep(1000);
    };

    void inputData() throws InterruptedException {
        inputCardData();
        inputDiliveryData();
    }
    void inputCardData() throws InterruptedException {
        System.out.println("Введите номер карты");
        Scanner scanner = new Scanner(System.in);
        card.setId(scanner.nextInt());
        Random rand = new Random();
        card.setBalance(rand.nextInt(5000 - 1000) + 1000);

    };

    void inputDiliveryData() throws InterruptedException {
        System.out.println("Укажите адрес для доставки");
        Scanner scanner = new Scanner(System.in);
        delieveryData = scanner.next();
    };
}