public class CreditCard {
    int id;
    double balance;

    public CreditCard() { }

    public CreditCard(int number,int balance){
        this.id = number;
        this.balance = balance;
    }

    public void setId(int number) {
        this.id = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}
