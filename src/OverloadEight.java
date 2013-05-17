import java.util.Date;

public class OverloadEight {
    public <T> void someOverloadedMethod(T o) {
        System.out.println("call to someOverloadedMethod(Object o)");
    }

    public void someOverloadedMethod(Date d) {
        System.out.println("call to someOverloadedMethod(Date d)");
    }

    public <T> void methodCaller(T t) {
        someOverloadedMethod(t);
    }

    public static void main(String[] args) {
        new OverloadEight().methodCaller(new Date());
    }
}
