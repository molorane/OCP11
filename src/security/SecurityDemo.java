package security;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class SecurityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            String str = AccessController.doPrivileged(new PrivilegedAction<String>() {
                public String run() {
                    return System.getProperty("java.rmi");
                }
            }, AccessController.getContext());
            
            System.out.println(str);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

	}

}
