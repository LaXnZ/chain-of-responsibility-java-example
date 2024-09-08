public class Manager implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == 3) {
            System.out.println("Handled by Manager.");
        } else {
            System.out.println("Manager: Request cannot be fulfilled");
        }
    }

    @Override
    public void setNextHandler(RequestHandler nextHandler) {

    }
}
