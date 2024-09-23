public class User {
    private int balance;
    private String cardNumber;
    private String pin;

        public User(String cardNumber, String pin) {
            this.cardNumber = cardNumber;
            this.pin = pin;
        }

    public String getCardNumber() {
            return cardNumber;
        }
        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }
        public String getPin() {
            return pin;
        }
        public void setPin(String pin) {
            this.pin = pin;
        }
}
