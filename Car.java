public class Car {
    private String color, model, price, transmission;

    public Car(String color, String model, String price, String transmission){
        this.color = color;
        this.model = model;
        this.price = price;
        this.transmission = transmission;
    }

    public void getInfo() {
        System.out.println("Moshina rangi " + color);
        System.out.println("Moshina modeli " + model);
        System.out.println("Moshina narhi " + price);
        System.out.println("Moshina transmissiyasi " + transmission);
    }
}