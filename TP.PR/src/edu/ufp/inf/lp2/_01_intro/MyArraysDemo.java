package edu.ufp.inf.lp2._01_intro;

public class MyArraysDemo {

   public static void testArrayPrimitives(){

       int arrInt[] = new int[10];
       for (int i = 0; i < arrInt.length ; i++)
       {
           arrInt[i] = i;
           System.out.println("arrInt[" + i + "] = " + arrInt[i]);
       }
       for (int i : arrInt){
           System.out.println(i);
       }

   };

   public static void testArrayObjects(){

       Point[] arrPts = new Point[10];
       arrPts[0] = new Point(0.0f, 0.0f);
       arrPts[0].getX();

       for (int i = 0; i < arrPts.length; i++){
           arrPts[i] = new Point((float) i,(float) i);
           System.out.println("arrPts[" + i + "] = " + arrPts[i]);
       }
       for (Point p : arrPts){          // for each , para cada ponto p imprime o arrPts até à sua lenght
           System.out.println(p.toString());
       }

       
   };


    public static void main(String[] args) {
        testArrayPrimitives();
        testArrayObjects();
    }
}
