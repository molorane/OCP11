package generic;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class C  { 
	
	public <T extends Number, Z extends Number> Map<T,Z> getMap(T t,Z z){
		return new HashMap<T, Z>();
	}
}

public class Demo2 extends C {
	
	@Override
	public Map<Integer,Integer> getMap(Number t,Number z){
		return new HashMap<Integer, Integer>();
	}
	
	public static void En(Object o){
		System.out.println(o.getClass());
	}
	
	public <P> void k() {
		
	}

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add(7);
		
		list.forEach(Demo2::En);
	}

}
