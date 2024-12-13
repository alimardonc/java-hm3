public class Main {
    public static void main(String[] args) {
        Car car = new Car("qora", "bmw", "50,000", "avtomat");
        car.getInfo();

        Pyramid pyramidInt = new Pyramid(3, 4, 5);
        Pyramid pyramidDouble = new Pyramid(3.5, 4.5, 5.5);
        Pyramid pyramidFloat = new Pyramid(3.5, 4.5, 5.5);
        Pyramid pyramidLong = new Pyramid(3L, 4L, 5L);

        pyramidInt.print();
        pyramidDouble.print();
        pyramidFloat.print();
        pyramidLong.print();

        Point point = new Point(1.1, 2.2, 3.3);
        point.print();
    }
}