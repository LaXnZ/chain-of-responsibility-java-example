public class Main {
    public static void main(String[] args) {

        Request request1 = new Request(1);
        Request request2 = new Request(2);
        Request request3 = new Request(3);
        Request request4 = new Request(4);

        RequestHandler clerk = new Clerk();
        RequestHandler supervisor = new Supervisor();
        RequestHandler manager = new Manager();

        clerk.setNextHandler(supervisor);
        supervisor.setNextHandler(manager);

        clerk.handleRequest(request1);
        clerk.handleRequest(request2);
        clerk.handleRequest(request3);
        clerk.handleRequest(request4);
    }
}