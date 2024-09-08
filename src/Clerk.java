public class Clerk implements RequestHandler{
    private RequestHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == 1){
            System.out.println("Handled by Clerk.");
        } else {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
