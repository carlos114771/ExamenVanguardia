public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("El Cajero no tiene dinero suficiente");
        System.out.println("Tarjeta retirada");

    }

    @Override
    public void ejectCard() {
        System.out.println("El Cajero no tiene dinero suficiente");

    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("El Cajero no tiene dinero suficiente");

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("El Cajero no tiene dinero suficiente");

    }

}