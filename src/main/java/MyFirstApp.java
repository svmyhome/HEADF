import main.java.java1;

import java.sql.SQLOutput;

public class MyFirstApp {


    public static void main(String[] args) {

        System.out.println("I am managed");
        System.out.println("this world");
        java1 ja = new java1();
        ja.setName("small");
        ja.getName();


        java1 ja1 = new java1();
        ja1.setName("Medium");
        int jjjj = ja1.age(15);
        System.out.println(jjjj);
        java1 ja2 = new java1();
        ja2.setName("large");

        System.out.println(ja1.getName());
        System.out.println(ja2.getName());

        ja.bark(5);
        ja1.bark(80);
        ja2.bark(101);
        System.out.println(ja1.jsd);

        java1[] jaarr = new java1[4];
        jaarr[0] = new java1();
        jaarr[0].setName("jfnvjnfv");
        System.out.println(jaarr[0].getName());
        String a1 = "bbb";
        String a2 = "bbb";
        System.out.println(a1.equals(a2));


    }

}
