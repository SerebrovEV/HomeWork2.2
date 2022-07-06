package pro.sky.java.course8.homework2_2;

public class Hogwards {
    private String name;
    private String surname;
    private int powerMagic;
    private int distanceTeleport;

   public Hogwards (String name, String surname, int powerMagic, int distanceTeleport) {
        this.name = name;
        this.surname = surname;
        this.powerMagic = powerMagic;
        this.distanceTeleport = distanceTeleport;
            }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getDistanceTeleport() {
        return distanceTeleport;
    }

    public void setDistanceTeleport(int distanceTeleport) {
        this.distanceTeleport = distanceTeleport;
    }

}
