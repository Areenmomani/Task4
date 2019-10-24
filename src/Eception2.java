public class Eception2 extends Throwable {
    private String Message;
    public Eception2(){}

    public String getMessage() {
        Message="The SIN does not exist";
        return Message;
    }

}
