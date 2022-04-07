package test.other;

import java.util.ArrayList;

import test.animal.Frog;

public class Tadpole extends Frog {


    public static void main(String[] args) {

        var list = new ArrayList<String>();
        list.add("a");
        for (String s : list) {
        } // DOES NOT COMPILE

    }
}