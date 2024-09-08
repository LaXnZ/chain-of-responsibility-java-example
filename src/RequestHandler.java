public interface RequestHandler {
    void handleRequest(Request request);
    void setNextHandler(RequestHandler nextHandler);

}
