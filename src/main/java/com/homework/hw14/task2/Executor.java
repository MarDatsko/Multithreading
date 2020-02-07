package main.java.com.homework.hw14.task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    Client yura = new Client(new Request(), "Yura");
    Client max = new Client(new Request(), "Max");
    Client oleg = new Client(new Request(), "Oleg");
    Client vlad = new Client(new Request(), "Vlad");
    Client dima = new Client(new Request(), "Dima");
    Client ivan = new Client(new Request(), "Ivan");
    Client marian = new Client(new Request(), "Marian");
    Client bogdan = new Client(new Request(), "Bogdan");

    public void run() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(yura);
        executorService.submit(max);
        executorService.submit(oleg);
        executorService.submit(vlad);
        executorService.submit(dima);
        executorService.submit(ivan);
        executorService.submit(marian);
        executorService.submit(bogdan);
        executorService.shutdown();
    }
}
