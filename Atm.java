import java.util.HashMap;
import java.util.Scanner;

public class Atm {
    private HashMap<Integer, Integer> balances;
    private HashMap<Integer, Integer> passwords;
    private HashMap<String, Integer> users;

    public Atm() {
        balances = new HashMap<>();
        passwords = new HashMap<>();
        users = new HashMap<>();
    }
    public void newAccount() {}
    public void dipositBalance() {}
    public void widrawBalance() {}
    public void prompt() {
        System.out.println("\t******* Welcome to atm cli *******");
        System.out.println("\t\t1. New User");
        System.out.println("\t\t2. Deposit Balance");
        System.out.println("\t\t3. Widraw Balance");
        System.out.println("\t\t4. Exit");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userId, userPassword, userBalance;
        String userName;
        int option;

        while (true) {
            System.out.print("\nEnter your option(1-4): ");
            option = sc.nextInt();
            break;
        }



        sc.close();
    }
}
