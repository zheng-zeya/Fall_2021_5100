package StrategyPattern;

public class PaypalStrategy implements PaymentStrategy {

    private String email;

    public PaypalStrategy(String email){
        this.email = email;
    }
    @Override
    public void pay(int price) {
        System.out.println("Paypal : $" + price);
    }
}
