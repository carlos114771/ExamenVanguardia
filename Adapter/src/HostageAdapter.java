public class HostageAdapter implements Enemy {

    Hostage theHostage;

    public HostageAdapter(Hostage newHostage) {
        theHostage = newHostage;
    }

    @Override
    public void fireWeapon() {
        theHostage.givesMoney();

    }

    @Override
    public void action(String theft) {
        theHostage.giveup(theft);
    }

    @Override
    public void movement() {
        theHostage.movement();

    }

}