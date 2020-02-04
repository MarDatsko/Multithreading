package main.java.com.homework.hw14.task1;

public class Husband extends Thread{
    BankAccount bankAccount = new BankAccount();

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
                bankAccount.printRestOfTheMoney();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
