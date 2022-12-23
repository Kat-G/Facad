public class Bank {
    boolean checkCardData(CreditCard card) throws InterruptedException {
        System.out.println("Проверка данных карты покупателя");
        Thread.sleep(1000);
        return (card.id > 1000);
    };

    boolean checkCardBalance(CreditCard card) throws InterruptedException {
        System.out.println("Проверка баланса карты покупателя");
        Thread.sleep(1000);
        return (card.balance > 100);
    };

    void makeTransaction(Customer cust, Seller seller) throws InterruptedException {
        System.out.println("Транзакция");
        cust.card.balance -= 50;
        seller.card.balance += 50;
        Thread.sleep(1000);
    };
}
