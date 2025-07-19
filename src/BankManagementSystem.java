
import java.util.Scanner;

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        while(true) {
            System.out.println("==== Bank Menu ====");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                int moneyToDeposit = scanner.nextInt();
                balance+=moneyToDeposit;
                System.out.println("Money deposited.");
            }
            else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                int moneyToWithdraw = scanner.nextInt();
                balance-=moneyToWithdraw;
                System.out.println("Money withdrawn.");
            }
            else if (choice == 3) {
                System.out.println("Your balance is: " + balance);
            }
            else if (choice == 4) {
               break;
            }
            else{
                System.out.println("Invalid choice");
            }
        }
    }
}