import java.util.Random;

public class Thief {

    Random generator = new Random();

    public void shootsweapon() {
        int damage = generator.nextInt(10) + 1;
        System.out.println("dispara " + damage + " balas");
    }

    public void grabmoney(String money) {
        System.out.println("Recoge el dinero" + money);

    }

    public void movement() {
        int move = generator.nextInt(10) + 1;
        System.out.println("Se mueve " + move + " pasos");
    }
}