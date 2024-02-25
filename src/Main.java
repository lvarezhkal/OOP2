public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 4);
        Car car2 = new Car("Volkswagen", 4);

        Truck truck = new Truck("Skania", 6);
        Truck truck2 = new Truck("Mercedes", 8);

        Bicycle bicycle = new Bicycle("BMX", 2);
        Bicycle bicycle2 = new Bicycle("Stels", 2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle);
        serviceStation.check(bicycle2);
        serviceStation.check(car);
        serviceStation.check(car2);
        serviceStation.check(truck);
        serviceStation.check(truck2);

    }
}