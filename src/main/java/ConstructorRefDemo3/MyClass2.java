/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstructorRefDemo3;

/**
 * @author madw
 */

// A simple, non-generic class.
public class MyClass2 {

    String str;
    // A constructor that takes an argument.

    MyClass2(String s) {
        str = s;
    }
    // The default constructor. This
    // constructor is NOT used by this program.

    MyClass2() {
        str = "";
    }
    // ...

    String getVal() {
        return str;
    }
}
