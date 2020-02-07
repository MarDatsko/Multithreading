package main.java.com.homework.hw14.task2;


public class Client implements Runnable {
    public static Server server = new Server();
    private String name;
    private Request request;

    public Client(Request request,String name) {
        this.name = name;
        this.request = request;
    }

    @Override
    public void run() {
        server.getRequest(request,name);
    }
}
