public class Car implements CarPlan {
    private String carChasis;
    private String carEngine;
    private String carTires;
    private String carInteriors;

    @Override
    public void setCarChasis(String chasis) {
        carChasis = chasis;
    }

    public String getCarChasis() {
        return carChasis;
    }

    @Override
    public void setCarEngine(String engine) {
        carEngine = engine;
    }

    public String getCarEngine() {
        return carEngine;
    }

    @Override
    public void setCarTires(String tires) {
        carTires = tires;
    }

    public String getCarTires() {
        return carTires;
    }

    @Override
    public void setCarInteriors(String interiors) {
        carInteriors = interiors;
    }

    public String getCarInteriors() {
        return carInteriors;
    }

}