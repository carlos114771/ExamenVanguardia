public class StockObserver implements Observer {
    private double tvPrice;
    private double stereoPrice;
    private double headsetsPrice;
    private double computerPrice;

    private static int observerTracker = 0;

    private int observerID;

    private Subject stock;

    public StockObserver(Subject stock) {
        this.stock = stock;

        this.observerID = ++observerTracker;
        System.out.println("Nuevo Observer " + this.observerID);
        stock.register(this);
    }

    @Override
    public void update(double tvPrice, double stereoPrice, double headsetsPrice, double computerPrice) {
        this.tvPrice = tvPrice;
        this.stereoPrice = stereoPrice;
        this.headsetsPrice = headsetsPrice;
        this.computerPrice = computerPrice;
        printPrice();
    }

    public void printPrice() {
        System.out.println(observerID + "\nTV: " + tvPrice + "\nSTereo: " + stereoPrice + "\nHeadSet: " + headsetsPrice
                + "\nComputer: " + computerPrice);
    }

}