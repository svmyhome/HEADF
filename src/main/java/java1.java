package main.java;

public class java1 {
    public String name;
    public int weight;

    public void bark(int weight) {
        if (weight < 10) {
            System.out.println("tif tif");
        } else if (weight == 80) {
            System.out.println("vaf vaf");
        } else if (weight > 80) {
            System.out.println("gav gav");
        }
    }

    public int age(int age) {
        return age + 5;
    }
}
