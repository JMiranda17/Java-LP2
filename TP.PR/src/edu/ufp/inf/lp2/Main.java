package edu.ufp.inf.lp2;


public class Main {
    public static void main(String[] args) {

        Date d1 = new Date((short) 4, (short) 1, 2000);
        Date d2 = new Date((short) 5, (short) 3, 2015);

        Person p1 = new Person("1", "João", "Rua X",d1);
        Person p2 = new Person("2", "José", "Rua Y",d2);

        System.out.println("ID = " + p1.getIdNumber());
        System.out.println("Nascimento = " + getDate);
        System.out.println("Data = " + d1.getYear());
        System.out.println("Data = " + p2.getBirth());
    }
}