public class TestCarBuilder {

    public static void main(String[] args) {

        CarBuilder oldStyleCar = new OldCarBuilder();

        CarEngineer carEngineer = new CarEngineer(oldStyleCar);

        carEngineer.makeCar();

        Car firstCar = carEngineer.getCar();

        System.out.println("Car Built");

        System.out.println("Car Chassis Type: " + firstCar.getCarChasis());
        System.out.println("Car Engine Type: " + firstCar.getCarEngine());
        System.out.println("Car Tires Type: " + firstCar.getCarTires());
        System.out.println("Car Interiors Type: " + firstCar.getCarTires());
    }
}