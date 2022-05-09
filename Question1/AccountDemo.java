package Question1;

import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Account no");
        String accountNumber = sc.nextLine();

        Account a = new Account();
        a.setAccountNumber(accountNumber);

        System.out.println("Deposit your Account:");
        int amount = Integer.parseInt(sc.nextLine());
        a.deposit(amount);

        System.out.println("Enter amount to withdraw:");

        int withdrawAmount = Integer.parseInt(sc.nextLine());
        try {
            a.withdraw(withdrawAmount);
            System.out.println("------------------");
            System.out.println("Withdraw sucessuful");
            System.out.println("Amount After withdraw:" + a.getBalance());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("------------");
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}
