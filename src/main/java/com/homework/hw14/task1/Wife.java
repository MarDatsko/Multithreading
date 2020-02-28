package main.java.com.homework.hw14.task1;

import java.math.BigDecimal;

public class Wife extends Thread {
    private final static Integer NUMBER_OF_OPERATIONS = 20;
    private BigDecimal sum;
    private BankAccount bankAccount = new BankAccount();

    public Wife(BigDecimal sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 0; i < NUMBER_OF_OPERATIONS; i++) {
            try {
                Thread.sleep(2500);
                System.out.println("Wife got money = " + sum + " balance - " + bankAccount.getMoney(sum));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Wife stopped spending money");
    }
}
