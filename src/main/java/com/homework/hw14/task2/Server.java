package main.java.com.homework.hw14.task2;

public class Server {

    public synchronized void getRequest(Request request, String name){
        System.out.println(request +" "+ name+ " try to connect" );
        System.out.println(name + " is connect");
        System.out.println(name + " we are processing the request");
        System.out.println(name + " request completed \n");
        System.out.println("Thread ID -"+Thread.currentThread().getId());
    }
}
