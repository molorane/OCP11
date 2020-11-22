package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAn{
	String str();
	int value();
}

@MyAn(value = 900, str="")
public class Demo1 {
	
	@MyAn(str="Example", value = 90)
	public static void myA() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Class<? extends Demo1> c = new Demo1().getClass();
			
			Method m = c.getMethod("myA");
			
			MyAn cx = c.getAnnotation(MyAn.class);
			
			MyAn ann = m.getAnnotation(MyAn.class);
			
			System.out.println(cx.str() + " "+ cx.value());
		}catch(Exception ex) {
			
		}
	}

}
