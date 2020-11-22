/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofundamentals.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author moloranemothusimichael
 */
public class Serialize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       serialize();
    }
    
    private static void serialize() {
		// TODO Auto-generated method stub
    	 User user = new User();
         user.setId(2014098616);
         user.setName("Nomfundo Molorane");
         user.setPassword("Blessing*4");
         user.setSalary(12500);
         
         System.out.println(user);
         
         //Serialization
         try(FileOutputStream fileout = new FileOutputStream("user.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileout);){
             out.writeObject(user);
         }catch(IOException ex){
             ex.printStackTrace();
         }
         
         user = null;
         System.out.println("Object erased: "+user);
	}
    
    private static void deserialize() {
		// TODO Auto-generated method stub

    	 User user = new User();
    	 
    	 //Diserialization
         try(FileInputStream fileIn = new FileInputStream("user.ser");
             ObjectInputStream In = new ObjectInputStream(fileIn)){
             user = (User) In.readObject();
         }catch(IOException ex){
             ex.printStackTrace();
             return;
         }catch(ClassNotFoundException c){
             System.out.println("Class not found!");
             c.printStackTrace();
             return;
         }
         
         System.out.println("Object Diserialized: "+user);
	}
    
}
