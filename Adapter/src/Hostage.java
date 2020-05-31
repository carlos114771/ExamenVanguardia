import java.util.Random;

public class Hostage {
    Random generator = new Random();

    public void givesMoney() {
        int money = generator.nextInt(100) + 1;
        System.out.println("Entrega " + money + " de dinero");
    }

    public void giveup(String theft) {
        System.out.println("Se rinde " + theft);
    }

    public void movement() {
        int movement = generator.nextInt(10) + 1;
        System.out.println("Se aleja " + movement + " pasos");
    }

}