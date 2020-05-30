public class GrackStock {
    public static void main(String[] args) {
        StockGrabber stock = new StockGrabber();

        // Envia las modificaciones
        StockObserver observer = new StockObserver(stock);

        stock.setCOMPUTERPrice(197.99);
        stock.setHEADSETSPrice(500.99);
        stock.setSTEREOPrice(249.99);
        stock.setTVPrice(999.99);


        // lo elimina
        stock.unregister(observer);

    }
}