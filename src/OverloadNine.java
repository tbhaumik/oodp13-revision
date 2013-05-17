import java.util.Date;

public class OverloadNine {
    public <T> void someOverloadedMethod(T o) {
        System.out.println("call to someOverloadedMethod(Object o)");
    }

    public void someOverloadedMethod(Date d) {
        System.out.println("call to someOverloadedMethod(Date d)");
    }

    public <T> void methodCaller(T t) {
        someOverloadedMethod((Date)t);
    }

    public static void main(String[] args) {
        new OverloadNine().methodCaller(new Date());
    }
}
