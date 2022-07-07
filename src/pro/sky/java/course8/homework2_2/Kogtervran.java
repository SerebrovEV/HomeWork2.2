package pro.sky.java.course8.homework2_2;

public class Kogtervran extends Hogwards{
    int smart;
    int wise;
    int witty;
    int fullOfCreativity;
    public Kogtervran(String name, String surname, int powerMagic, int distanceTeleport, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, surname, powerMagic, distanceTeleport);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }
}
