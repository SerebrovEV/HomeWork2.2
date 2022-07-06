package pro.sky.java.course8.homework2_2;

import java.util.Objects;

public class Slizerin extends Hogwards {

    private int craftiness;
    private int resolute;
    private int ambitiousness;
    private int resourcefulness;
    private int lustOfPower;


        public Slizerin(String name, String surname, int powerMagic, int distanceTeleport, int craftiness, int resolute, int ambitiousness, int resourcefulness, int lustOfPower) {
        super(name, surname, powerMagic, distanceTeleport);
        this.craftiness = craftiness;
        this.resolute = resolute;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public int getCraftiness() {
        return craftiness;
    }

    public void setCraftiness(int craftiness) {
        this.craftiness = craftiness;
    }

    public int getResolute() {
        return resolute;
    }

    public void setResolute(int resolute) {
        this.resolute = resolute;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }


}
