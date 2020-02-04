package main.java.com.homework.hw14.task1;

import java.math.BigDecimal;

public class Executor {
    Husband husband = new Husband();
    Wife wife = new Wife(BigDecimal.valueOf(50));
    BankAccount bankAccount = new BankAccount();

    public void run() {
        bankAccount.setMoney(BigDecimal.valueOf(1550));
        wife.start();
        husband.start();
    }
}
