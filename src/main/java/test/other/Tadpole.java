package test.other;

import test.animal.Frog;

import java.util.ArrayList;

public class Tadpole extends Frog {


    public static void main(String[] args) {

        var list = new ArrayList<String>();
        list.add("a");
        for (String s : list) {
        } // DOES NOT COMPILE

    }
}