import java.util.Date;

public class OverloadFour {
	public  void someOverloadedMethod(Object o) {
		System.out.println("call to someOverloadedMethod(Object o)");
	}
	
	public  void someOverloadedMethod(Date d){
		System.out.println("call to someOverloadedMethod(Date d)");
	}
	
	public  void methodCaller(Date t){
		someOverloadedMethod(t);
	}
	
	public static void main(String[] args){
		new OverloadFour().methodCaller(new Date());
	}
}
