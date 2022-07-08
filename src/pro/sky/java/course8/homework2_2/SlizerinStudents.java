package pro.sky.java.course8.homework2_2;

public class SlizerinStudents extends HogwardsStudents {

    private int craftiness;
    private int resolute;
    private int ambitiousness;
    private int resourcefulness;
    private int lustOfPower;

    public SlizerinStudents(String name, String surname, int powerMagic, int distanceTeleport, int craftiness, int resolute, int ambitiousness, int resourcefulness, int lustOfPower) {
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

    @Override
    public String toString() {
        return "SlizerinStudents:" +
                " name= " + getName() +
                ", surname= " + getSurname() +
                ", power magic= " + getPowerMagic() +
                ", power teleport= " + getDistanceTeleport() +
                ", craftiness=" + craftiness +
                ", resolute=" + resolute +
                ", ambitiousness=" + ambitiousness +
                ", resourcefulness=" + resourcefulness +
                ", lustOfPower=" + lustOfPower;
    }

    public void comparePowerSlizerinStudents(SlizerinStudents student) {
        int power = craftiness + resolute + ambitiousness + resourcefulness + lustOfPower;
        int powerStudent = student.getCraftiness() + student.getResolute() + student.getAmbitiousness() + student.getResourcefulness() + student.getLustOfPower();
        if (power > powerStudent) {
            System.out.println(getName() + " " + getSurname() + " лучший Слизеринец, чем " + student.getName() + " " + student.getSurname());
        } else if (powerStudent > power) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Слизеринец, чем " + getName() + " " + getSurname());
        } else {
            System.out.println("Они равны)");
        }
    }
}


