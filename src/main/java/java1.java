package main.java;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class java1 {
    private String name;
    private int weight;

    public String jsd;

    public void setName(String name1) {
        name = name1;
    }

    public void setWeight(int weight1) {
        weight = weight1;
    }

    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }

    public void bark(int weight) {
        if (weight < 10) {
            System.out.println("tif tif");
        } else if (weight == 80) {
            System.out.println("vaf vaf");
        } else if (weight > 80) {
            System.out.println("gav gav");

        }
        String numb = "3";
        System.out.println(Integer.parseInt(numb) + 3);
        int ma[] = {1,4, 6};
        for( int index : ma) {
            System.out.println(index);
        }

        ArrayList<String> myList = new ArrayList<String>();
        String a = "Hello";
        String b = "Hello2";
        System.out.println(myList.size());
        myList.add(a);
        myList.add(b);
        for (Object index: myList) {
            System.out.println("Massive " + index);

        }
        System.out.println(myList.size());
        Object o = myList.get(0);
        System.out.println(o);
        myList.remove(0);
        System.out.println(myList.size());

        ArrayList<Integer> myInt = new ArrayList<Integer>();
        int brt = 4;
        int brt2 = 4;
        myInt.add(brt);
        myInt.add(brt2);
        Object on = myInt.get(0);
        System.out.println(myInt.size());
        System.out.println(on);






    }




    public int age(int age) {
        return age + 5;
    }
}
