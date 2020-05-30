import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double tvPrice;
    private double stereoPrice;
    private double headsetsPrice;
    private double computerPrice;

    public StockGrabber() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);

    }

    @Override
    public void unregister(Observer deleteObserver) {

        int observerind = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerind + 1) + " Eliminado");
        observers.remove(observerind);

    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(tvPrice, stereoPrice, headsetsPrice, computerPrice);
        }

    }

    // Notifica el cambio de los precios al Observer
    public void setTVPrice(double newTVPrice) {
        this.tvPrice = newTVPrice;
        notifyObserver();
    }

    public void setSTEREOPrice(double newSTEREOPrice) {
        this.stereoPrice = newSTEREOPrice;
        notifyObserver();
    }

    public void setHEADSETSPrice(double newHEADSETSPrice) {
        this.headsetsPrice = newHEADSETSPrice;
        notifyObserver();
    }

    public void setCOMPUTERPrice(double newCOMPUTERPrice) {
        this.computerPrice = newCOMPUTERPrice;
        notifyObserver();
    }

}