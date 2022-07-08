package pro.sky.java.course8.homework2_2;

public class KogtervranStudents extends HogwardsStudents {
    private int smart;
    private int wise;
    private  int witty;
    private int fullOfCreativity;
    public KogtervranStudents(String name, String surname, int powerMagic, int distanceTeleport, int smart, int wise, int witty, int fullOfCreativity) {
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

    @Override
    public String toString() {
        return "KogtervranStudents:" +
                " name= " + getName() +
                ", surname= " + getSurname() +
                ", power magic= " + getPowerMagic() +
                ", power teleport= " + getDistanceTeleport() +
                ", smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity;
    }

    public void comparePowerKogtervranStudents(KogtervranStudents student) {
        int power = smart + wise + witty + fullOfCreativity;
        int powerStudent = student.getSmart() + student.getWise() + student.getWitty() + student.getFullOfCreativity();
        if (power > powerStudent) {
            System.out.println(getName() + " " + getSurname() + " лучший Когтевранец, чем " + student.getName() + " " + student.getSurname());
        } else if (powerStudent > power) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Когтевранец, чем " + getName() + " " + getSurname());
        } else {
            System.out.println("Они равны)");
        }
    }
}
