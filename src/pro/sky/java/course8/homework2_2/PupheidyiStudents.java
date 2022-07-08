package pro.sky.java.course8.homework2_2;

public class PupheidyiStudents extends HogwardsStudents {
    private int hardworking;
    private int faithful;
    private int truthful;

    public PupheidyiStudents(String name, String surname, int powerMagic, int distanceTeleport, int hardworking, int faithful, int truthful) {
        super(name, surname, powerMagic, distanceTeleport);
        this.hardworking = hardworking;
        this.faithful = faithful;
        this.truthful = truthful;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getFaithful() {
        return faithful;
    }

    public void setFaithful(int faithful) {
        this.faithful = faithful;
    }

    public int getTruthful() {
        return truthful;
    }

    public void setTruthful(int truthful) {
        this.truthful = truthful;
    }

    @Override
    public String toString() {
        return "PupheidyiStudents:" +
                " name= " + getName() +
                ", surname= " + getSurname() +
                ", power magic= " + getPowerMagic() +
                ", power teleport= " + getDistanceTeleport() +
                ", hardworking=" + hardworking +
                ", faithful=" + faithful +
                ", truthful=" + truthful;
    }
    public void comparePowerPupheydyiStudents(PupheidyiStudents student) {
        int power = hardworking + faithful + truthful;
        int powerStudent = student.getHardworking() + student.getFaithful() + student.getTruthful();
        if (power > powerStudent) {
            System.out.println(getName() + " " + getSurname() + " лучший Пуффендуец, чем " + student.getName() + " " + student.getSurname());
        } else if (powerStudent > power) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Пуффендуец, чем " + getName() + " " + getSurname());
        } else {
            System.out.println("Они равны)");
        }
    }
}
