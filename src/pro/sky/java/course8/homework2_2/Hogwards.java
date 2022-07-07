package pro.sky.java.course8.homework2_2;

import java.util.Objects;

public class Hogwards {
    private String name;
    private String surname;
    private int powerMagic;
    private int distanceTeleport;

    public Hogwards(String name, String surname, int powerMagic, int distanceTeleport) {
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

    @Override
    public String toString() {
        return "Hogwards{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", powerMagic=" + powerMagic +
                ", distanceTeleport=" + distanceTeleport +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hogwards)) return false;
        Hogwards hogwards = (Hogwards) o;
        return Objects.equals(name, hogwards.name) && Objects.equals(surname, hogwards.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    //public void bestStudentHogwards(String nameFirst, String surnameFirst, String nameSecond, String surnameSecond, int numberStudents) {
    //    for (int i = 0; i < numberStudents; i++) {
    //    if (nameFirst == )
     //   }
   // }

}
