package main.java.com.homework;

public class Client extends Thread {
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
