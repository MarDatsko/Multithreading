package main.java.com.homework.hw13;

import java.util.Random;

public class Request {
    private Integer id;

    public Request() {
        this.id = new Random().nextInt(5555555);
    }

    @Override
    public String toString() {
        return id.toString();
    }

}
