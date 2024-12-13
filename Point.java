public class Point {
    private double x, y, z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void print() {
        System.out.println(" x: " + x + " y: " + y + " z: " + z);
    }
}
