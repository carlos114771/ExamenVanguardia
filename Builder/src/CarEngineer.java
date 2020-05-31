public class CarEngineer {
    private CarBuilder carBuilder;

    public CarEngineer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar() {
        return this.carBuilder.getCar();
    }

    public void makeCar() {
        this.carBuilder.buildCarChasis();
        this.carBuilder.buildCarEngine();
        this.carBuilder.buildCarTires();
        this.carBuilder.buildCarInteriors();
    }
}