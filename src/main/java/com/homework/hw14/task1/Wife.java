package main.java.com.homework.hw14.task1;

import java.math.BigDecimal;

public class Wife extends Thread {
    private BigDecimal sum;
    BankAccount bankAccount = new BankAccount();

    public Wife(BigDecimal sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(2500);
                System.out.println(bankAccount.getMoney(sum));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
