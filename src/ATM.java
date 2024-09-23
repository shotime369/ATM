import java.util.Scanner;

public class ATM {

    public void login(User user) {

        if (Bank.verify(user.getCardNumber(), user.getPin())) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed. Invalid card number or PIN.");
        }
    }

    public void menu(){
        Scanner sc=new Scanner(System.in);
        String choice;
        System.out.println("Choose 1-4: \n 1: Check Balance \n 2: Withdraw \n 3: Exit");
        choice = sc.nextLine();
        switch (choice) {
            case "1" -> {
                System.out.println("Check Balance");
                System.out.println(Bank.checkBalance());
                menu();
            }
            case "2" -> {
                System.out.println("Withdraw");
                withdraw();
            }
            case "3" -> {
                System.out.println("Exit");
                System.exit(0);
            }
            default -> System.out.println("Invalid choice");
        }

    }
    public void withdraw() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        String amount=sc.nextLine();
        Bank.verifyBalance(amount);
        menu();
    }
    }

