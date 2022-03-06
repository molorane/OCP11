/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapuzzles;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author madw
 */
public class Autoboxing {

    public static void main(String[] args) {
        test();
    }
    
    public static void test() {
        Set<Object> list = new HashSet<>();
        for(short s=0;s<=10;s++){
            list.add(s);
            list.remove(s-1);
        }
        System.out.println(list.size());
    }

}
