package com.hdfc.week1.day5.payments;

public class Demo implements InterfacePayment{

    @Override
    public String ret(){
        return "Inside Interface Payment";
    }

    static void main() {
        Payment payment = new UPIPayment();
        payment.paymentStarted();
        payment.pay(2000);

        Payment payment1 = new CreditCardPayment();
        payment1.paymentStarted();
        payment1.pay(2000);

        Payment payment2 = new DebitCardPayment();
        payment2.paymentStarted();
        payment2.pay(2000);

    }
}
