package Truck;

public class TruckMain {
    public static void main(String[] args) {

        Truck truck1 = new Truck(1100);
        Truck truck2 = new Truck(1600);
        police pol1 = new police(1500);
        System.out.println(pol1.diffWeight(truck1));
        System.out.println(pol1.diffWeight(truck2));

    }
}
