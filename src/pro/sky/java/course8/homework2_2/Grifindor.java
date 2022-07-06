package pro.sky.java.course8.homework2_2;

public class Grifindor extends Hogwards{
    private int nobility;
    private int honor;
    private int bravery;

    public Grifindor(String name, String surname, int powerMagic, int distanceTeleport, int nobility, int honor, int bravery) {
        super(name, surname, powerMagic, distanceTeleport);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
