package main.java;

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
    }

    public int age(int age) {
        return age + 5;
    }
}
