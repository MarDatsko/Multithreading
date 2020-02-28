package main.java.com.homework.hw14.task1;

public class Husband extends Thread{
    private final static Integer NUMBER_OF_OPERATIONS = 20;
    private BankAccount bankAccount = new BankAccount();

    @Override
    public void run() {
        for (int i = 0; i < NUMBER_OF_OPERATIONS; i++) {
            try {
                Thread.sleep(1000);
                bankAccount.printRestOfTheMoney();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Husband got tired of checking the balance");
    }
}
