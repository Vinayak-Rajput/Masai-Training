package com.hdfc.week1.day5.interfaceProject;

public class PaymentDemo {
    public void processPayment(Payment payment){
        payment.pay(100);
        if(payment instanceof UPIPayment u1){
            u1.rewardPoints();
        }

    }

    static void main() {
        PaymentDemo payDemo = new PaymentDemo();
        payDemo.processPayment(new UPIPayment());
        payDemo.processPayment(new NetBankingPayment());
        payDemo.processPayment(new CreditCardPayment());
    }
}
