package pro.sky.java.course8.homework2_2;

public class Pupheidyi extends Hogwards{
    int hardworking;
    int faithful;
    int truthful;

    public Pupheidyi(String name, String surname, int powerMagic, int distanceTeleport, int hardworking, int faithful, int truthful) {
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
}
