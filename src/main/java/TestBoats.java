public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        rowboat b3 = new rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}
