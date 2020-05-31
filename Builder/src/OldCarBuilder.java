public class OldCarBuilder implements CarBuilder {

    private Car car;

    public OldCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildCarChasis() {
        car.setCarChasis("Ladder Chassis");

    }

    @Override
    public void buildCarEngine() {
        car.setCarEngine("Inline Engine");

    }

    @Override
    public void buildCarTires() {
        car.setCarTires("Performance Tires");

    }

    @Override
    public void buildCarInteriors() {
        car.setCarInteriors("Leather Interiors");

    }

    @Override
    public Car getCar() {
        return this.car;
    }

}