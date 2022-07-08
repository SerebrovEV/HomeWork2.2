package pro.sky.java.course8.homework2_2;

import java.util.Objects;

public abstract class HogwardsStudents {
    private String name;
    private String surname;
    private int powerMagic;
    private int distanceTeleport;

    public HogwardsStudents(String name, String surname, int powerMagic, int distanceTeleport) {
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

    public void printStudents() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "HogwardsStudents:" +
                " Имя= " + name +
                ", Фамилия= " + surname +
                ", Мощность магии= " + powerMagic +
                ", Мощность телепорта= " + distanceTeleport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HogwardsStudents)) return false;
        HogwardsStudents hogwards = (HogwardsStudents) o;
        return Objects.equals(name, hogwards.name) && Objects.equals(surname, hogwards.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public void comparePowerStudents(HogwardsStudents student) {
        int power = powerMagic;
        int powerStudent = student.getPowerMagic();
        int teleport = distanceTeleport;
        int teleportStudent = student.distanceTeleport;

        if (power > powerStudent) {
            System.out.println (name + " " + surname + " более мощный волшебник, чем " + student.getName() + " " + student.getSurname());
        } else if (powerStudent > power) {
            System.out.println(student.getName() + " " + student.getSurname() + " более мощный волшебник, чем " + name + " " + surname);
        } else {
            System.out.println(name + " " + surname + " и " + student.getName() + " " + student.getSurname() + " равны по мощи волщебства.");
        }

        if (teleport > teleportStudent) {
            System.out.println(name + " " + surname + " более мощный в трансгрессии, чем " + student.getName() + " " + student.getSurname());
        } else if (teleportStudent > teleport) {
            System.out.println(student.getName() + " " + student.getSurname() + " более мощный в трансгрессии, чем " + name + " " + surname);
        } else {
            System.out.println(name + " " + surname + " и " + student.getName() + " " + student.getSurname() + " равны в трансгрессии.");
        }

    }



}
