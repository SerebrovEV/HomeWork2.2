package pro.sky.java.course8.homework2_2;

public class GrifindorStudents extends HogwardsStudents {
    private int nobility;
    private int honor;
    private int bravery;

    public GrifindorStudents(String name, String surname, int powerMagic, int distanceTeleport, int nobility, int honor, int bravery) {
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

    @Override
    public String toString() {
        return "GrifindorStudents:" +
                " name= " + getName() +
                ", surname= " + getSurname() +
                ", power magic= " + getPowerMagic() +
                ", power teleport= " + getDistanceTeleport() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
    public void comparePowerGrifindorStudents(GrifindorStudents student) {
        int power = nobility + honor + bravery;
        int powerStudent = student.getNobility() + student.getHonor() + student.getBravery();
        if (power > powerStudent) {
            System.out.println(getName() + " " + getSurname() + " лучший Гриффиндорец, чем " + student.getName() + " " + student.getSurname());
        } else if (powerStudent > power) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Гриффиндорец, чем " + getName() + " " + getSurname());
        } else {
            System.out.println("Они равны)");
        }
    }

}
