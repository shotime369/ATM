public class Bank {

    public static boolean verify(String cardNumber, String pin) {
        String validCardNumber = "123456789";
        String validPin = "1234";
        return cardNumber.equals(validCardNumber) && pin.equals(validPin);
    }

    public static int checkBalance(){
     return 250;
    }

    public static void verifyBalance(String amount){
       int balance=checkBalance();
       if (balance<Integer.parseInt(amount)){
           System.out.println("Not enough balance");
       }
       else if (balance>=Integer.parseInt(amount)){
           System.out.println("Withdraw successful");
       }
    }
}
