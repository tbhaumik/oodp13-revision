import java.util.Date;

public class OverloadSix {
    public void someOverloadedMethod(Object o) {
        System.out.println("call to someOverloadedMethod(Object o)");
    }

    public void someOverloadedMethod(Date d) {
        System.out.println("call to someOverloadedMethod(Date d)");
    }

    public <T> void methodCaller(T t) {
        someOverloadedMethod(t);
    }

    public void methodCaller(Date t) {
        someOverloadedMethod(t);
    }

    public static void main(String[] args) {
        new OverloadSix().methodCaller(new Date());
    }
}
