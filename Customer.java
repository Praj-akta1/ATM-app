import java.util.*;
public class Customer {
    String name;
    int cardno;
    double balance;
    double limit;
    int pin;

    public Customer() {
    }

    public Customer(String name, int cardno, double balance, double limit, int pin) {

        this.name = name;
        this.cardno = cardno;
        this.balance = balance;
        this.limit = limit;
        this.pin = pin;
    }

    public String GetName() {
        return name;
    }

    public double GetLimit() {
        return limit;
    }

    public double GetBalance() {
        return balance;
    }

    public int GetCardno() {
        return cardno;
    }

    public void SetBalance(double balance) {
        this.balance = balance;
    }

    public void SetPin(int pin) {
        this.pin = pin;
    }

    public int GetPin() {
        return pin;
    }
}
