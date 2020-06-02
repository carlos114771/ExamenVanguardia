public class NoCard implements ATMState {
    ATMMachine atmMachine;

    public NoCard(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Ingrese su Pin");
        atmMachine.setATMState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("No ha ingresado la Tarjeta");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("No ha ingresado la tarjeta");

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("No ha ingresado la tarjeta");
    }

}