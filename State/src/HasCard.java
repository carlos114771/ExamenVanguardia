public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Solo se puede Ingresar una tarjeta a la vez");

    }

    @Override
    public void ejectCard() {
        System.out.println("Su tarjeta ha sido retirada");
        atmMachine.setATMState(atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pinEntered) {
        if (pinEntered == 1234) {
            System.out.println("Pin Correcto Ingresado");
            atmMachine.correctPinEntered = true;
        } else {
            System.out.println("Pin Incorrecto");
            atmMachine.correctPinEntered = false;
            System.out.println("Tarjeta Retirada");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("No ha ingresado su Pin");
    }

}