package main.java.com.homework.hw13;

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
        yura.start();
        max.start();
        oleg.start();
        vlad.start();
        dima.start();
        ivan.start();
        marian.start();
        bogdan.start();
    }
}
