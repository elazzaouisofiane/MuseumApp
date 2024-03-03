public class Car extends Vehicle {
    String licenceplatenumber;
    String owner;

    public static void main(String[] args) {
        System.out.println(new Vehicle().brand);
        System.out.println(new Car().brand);
        new Car().move();
    }
}
