public class TestAdapter {
    public static void main(String[] args) {
        Hostage theHostage = new Hostage();
        Enemy hostageadapter = new HostageAdapter(theHostage);
        Thief theThief = new Thief();

        System.out.println("El ladron");
        theThief.shootsweapon();
        theThief.grabmoney("");
        theThief.movement();
        System.out.println("------------------");
        System.out.println("El Rehen");
        theHostage.giveup("");
        theHostage.givesMoney();
        theHostage.movement();
    }
}