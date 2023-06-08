import java.util.*;
class Transaction {

    Scanner sc = new Scanner(System.in);

    void AccountBal(Customer currentUser) {
        System.out.println(currentUser.GetBalance());
    }

    void withdraw(Customer currentUser) {
        System.out.println("Enter the Amount");
        double withdrawamt = sc.nextDouble();
        if (currentUser.balance < withdrawamt) {
            System.out.println("Insufficient Balance.");
        } else {
            currentUser.balance = currentUser.balance - withdrawamt;
            System.out.println("Money withdraw successfully.");
        }
    }

    void Deposite(Customer currentuser) {
        System.out.println("Enter the amount:");
        double Depositeamt = sc.nextDouble();
        currentuser.balance = currentuser.balance + Depositeamt;
    }
}

