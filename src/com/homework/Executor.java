package com.homework;

public class Executor {

    Client Yura = new Client(new Request(), "Yura");
    Client Max = new Client(new Request(), "Max");
    Client Oleg = new Client(new Request(), "Oleg");
    Client Vlad = new Client(new Request(), "Vlad");
    Client Dima = new Client(new Request(), "Dima");
    Client Ivan = new Client(new Request(), "Ivan");
    Client Marian = new Client(new Request(), "Marian");
    Client Bogdan = new Client(new Request(), "Bogdan");

    public void run() {
        Yura.start();
        Max.start();
        Oleg.start();
        Vlad.start();
        Dima.start();
        Ivan.start();
        Marian.start();
        Bogdan.start();
    }
}
