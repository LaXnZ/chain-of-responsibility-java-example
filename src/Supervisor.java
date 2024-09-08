public class Supervisor implements RequestHandler{
    private RequestHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == 2){
            System.out.println("Handled by Supervisor.");
        } else {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
