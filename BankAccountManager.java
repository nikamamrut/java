//q18
import java.util.Scanner;
import java.util.Vector;

public class BankAccountManager {
    private static Vector<BankAccount> accounts = new Vector<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\nBank Account Manager\n");
            System.out.println("1. Add Account");
            System.out.println("2. Search Account");
            System.out.println("3. Delete Account");
            System.out.println("4. Display Accounts");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addAccount();
                    break;
                case 2:
                    searchAccount();
                    break;
                case 3:
                    deleteAccount();
                    break;
                case 4:
                    displayAccounts();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accNo = scanner.nextInt();

        System.out.print("Enter account name: ");
        String name = scanner.next();

        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(accNo, name, balance);
        accounts.add(account);

        System.out.println("Account added successfully.");
    }

    private static void searchAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accNo = scanner.nextInt();

        for (BankAccount account : accounts) {
            if (account.getAccNo() == accNo) {
                System.out.println("Account found:");
                System.out.println(account.toString());
                return;
            }
        }

        System.out.println("Account not found.");
    }

    private static void deleteAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accNo = scanner.nextInt();

        for (BankAccount account : accounts) {
            if (account.getAccNo() == accNo) {
                accounts.remove(account);
                System.out.println("Account deleted successfully.");
                return;
            }
        }

        System.out.println("Account not found.");
    }

    private static void displayAccounts() {
        System.out.println("\nAccounts:\n");

        for (BankAccount account : accounts) {
            System.out.println(account.toString());
        }
    }
}
