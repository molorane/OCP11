/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapuzzles;

/**
 *
 * @author madw
 */
public class Floating {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        float f = 123456789;

        while (f-- > 0) {
            System.out.println(f);
        }
    }
}
