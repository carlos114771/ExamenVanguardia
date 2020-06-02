public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Su Tarjeta ya fue ingresada");
    }

    @Override
    public void ejectCard() {
        System.out.println("Su Tarjeta fue retirada");
        atmMachine.setATMState(atmMachine.getNoCashState());
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Ya ingreso el Pin");

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if (cashToWithdraw > atmMachine.cashInMachine) {
            System.out.println("No tiene saldo suficiente");
            System.out.println("Su tarjeta fue retirada");
            atmMachine.setATMState(atmMachine.getNoCardState());
        } else {
            System.out.println(cashToWithdraw + "entregado");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);

            System.out.println("Tarjeta retirada");
            atmMachine.setATMState(atmMachine.getNoCardState());
            if(atmMachine.cashInMachine<=0){
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }
    }

}