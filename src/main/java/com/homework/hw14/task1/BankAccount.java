package main.java.com.homework.hw14.task1;

import java.math.BigDecimal;

public class BankAccount {
    private static BigDecimal money = BigDecimal.valueOf(2500);

    public synchronized BigDecimal getMoney(BigDecimal sum) {
        if (money.compareTo(sum) <= 1) {
            money = money.subtract(sum);
        }else {
            money = BigDecimal.valueOf(0);
        }
        return money;
    }

    public void setMoney(BigDecimal moneyFromUser) {
        money = moneyFromUser;
    }

    public void printRestOfTheMoney() {
        System.out.println("Money on the balance: " + money);
    }


}
