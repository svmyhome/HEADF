package Truck;

public class police {
    int maxWeight;

    public police(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    public boolean diffWeight(Truck truck) {
        boolean order = true;
        if (maxWeight < truck.weight) {
            order = false;
        }
        return order;
    }

}
