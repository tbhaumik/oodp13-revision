import java.util.Date;

public class OverloadThree<T> {
	public  void someOverloadedMethod(Object o) {
		System.out.println("call to someOverloadedMethod(Object o)");
	}
	
	public  void someOverloadedMethod(Date d){
		System.out.println("call to someOverloadedMethod(Date d)");
	}
	
	public  void methodCaller(T t){
		someOverloadedMethod(t);
	}
	
	public static void main(String[] args){
		new OverloadThree<Date>().methodCaller(new Date());
	}
}
