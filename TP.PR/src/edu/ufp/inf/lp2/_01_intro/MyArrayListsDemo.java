package edu.ufp.inf.lp2._01_intro;

import java.util.ArrayList;

public class MyArrayListsDemo {

    public static void testRawArrayLists(){
        ArrayList arrList1 = new ArrayList();
        arrList1.add(new Object());
        arrList1.add("OLA");
        arrList1.add(new Point(1.0f,1.0f));
        arrList1.add(3,"OLA NOVAMENTE");
        for (Object o : arrList1){
            System.out.println(o.toString());
        }

    }

    public static void testGenerifiedArrayLists(){
        ArrayList <Point> arrPs = new ArrayList<>();
        arrPs.add(new Point(1.0f,1.0f));
        Point p = arrPs.get(0);
    };

    public static void main(String[] args) {

        testRawArrayLists();

    }


}
