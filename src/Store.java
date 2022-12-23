public class Store {
    Bank bank;
    Customer customer;
    StoreHouse storeHouse;
    Delivery delivery;
    Seller seller;

    public Store(){
        bank = new Bank();
        customer = new Customer();
        storeHouse = new StoreHouse();
        delivery = new Delivery();
        seller = new Seller();
    }
    void doSale() throws InterruptedException {
        customer.chooseProduct();
        customer.inputData();

        if(!storeHouse.isProductInStoreHouse(customer.product)){
            System.out.println("Товар отсутствует на складе");
            return;
        }

        if(!bank.checkCardData(customer.card)) {
            System.out.println("Указаны неверные данные карты");
            return;
        }
        if(!bank.checkCardBalance(customer.card)){
            System.out.println("Недостаточно средств на карте");
            return;
        }
        bank.makeTransaction(customer, seller);

        storeHouse.sellProduct(customer.product);
        storeHouse.transferToDelivery();

        delivery.transferToCustomer();
    }
}
