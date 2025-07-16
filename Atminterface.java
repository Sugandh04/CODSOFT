
import java.util.Scanner;

class Bankaccount {

    float balance=0;

        public Bankaccount(float initialBalance) {
        balance = initialBalance;
    }

    public void Withdrawal(float amount) {
        if (amount>0 && amount<=balance) {
            balance -= amount;
            System.out.println( amount + " Withdrawn");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void Deposit(float amount) {
        if (amount>0) {
            balance += amount;
            System.out.println(amount + " Deposited");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void CheckBalance() {
        System.out.println("The Balance is :" + balance);
    }
}

public class Atminterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Bankaccount useraccount = new Bankaccount(0.0f);
        do{
        System.out.println("Hello !");
        System.out.println("What would you like to do :");
        System.out.println("1.Withdrawal");
        System.out.println("2.Deposit");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit ");

        int input;
        float amount;
        input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("Enter the amount to be Widrawn:");
                amount = sc.nextFloat();
                useraccount.Withdrawal(amount);
                break;
            case 2:
                System.out.println("Enter the amount to be Deposited:");
                amount = sc.nextFloat();
                useraccount.Deposit(amount);
                break; 
            case 3:
                useraccount.CheckBalance();
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        }while(true);
    }

}
