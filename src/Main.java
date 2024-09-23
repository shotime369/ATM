
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Bank bank = new Bank();
        ATM atm = new ATM();
        //sout
        Scanner sc = new Scanner(System.in);
        System.out.println("Card entered");
        String cardNumber = "123456789";
        System.out.println("enter pin:");
        String pin = sc.nextLine();

        User p1 = new User(cardNumber, pin);
        atm.login(p1);
        atm.menu();
        }
    }

