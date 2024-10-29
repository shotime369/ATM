
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        Scanner sc = new Scanner(System.in);
        System.out.println("Card entered");
        String cardNumber = "123456789";
        System.out.println("enter pin:");
        String pin = sc.nextLine();


        User p1 = new User(cardNumber, pin);
        //User JaneDoe = new User(cardNumber, pin);
        atm.login(p1);
        atm.menu();
        }
    }

