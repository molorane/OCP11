package advanceclassdesign.innerclasses;

import java.util.*;

import timeit.TimeIt;

interface I {

	interface L {
		static int i = 9000;
	}
}

public class A1 {

	static int x = 0;

	public static void main(String[] args) {
		int x = 9;
		System.out.println(I.L.i);
	}

}
