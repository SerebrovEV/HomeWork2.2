package pro.sky.java.course8.homework2_2;

public class App {
    private static final SlizerinStudents[] SLIZERINS = new SlizerinStudents[3];
    private static final GrifindorStudents[] GRIFINDORS = new GrifindorStudents[3];
    private static final PupheidyiStudents[] PUPHEIDYIS = new PupheidyiStudents[3];
    private static final KogtervranStudents[] KOGTERVRANS = new KogtervranStudents[3];


    public static void main(String[] args) {
        SLIZERINS[0] = new SlizerinStudents("Draco", "Malfoy", 48, 60, 92, 56, 50, 21, 99);
        SLIZERINS[1] = new SlizerinStudents("Grehem", "Montegru", 75, 54, 40, 26, 40, 23, 37);
        SLIZERINS[2] = new SlizerinStudents("Gregori", "Goyl", 37, 76, 85, 65, 64, 74, 68);
        GRIFINDORS[0] = new GrifindorStudents("Harry", "Potter", 89, 50, 99, 99, 99);
        GRIFINDORS[1] = new GrifindorStudents("Hermiona", "Grendjer", 99, 99, 25, 10, 36);
        GRIFINDORS[2] = new GrifindorStudents("Ron", "Weasley", 10, 10, 50, 60, 70);
        PUPHEIDYIS[0] = new PupheidyiStudents("Zaharia", "Smit", 60, 68, 51, 28, 9);
        PUPHEIDYIS[1] = new PupheidyiStudents("Sedric", "Diggori", 82, 56, 78, 80, 71);
        PUPHEIDYIS[2] = new PupheidyiStudents("Justin", "Finch-Fletchley", 31, 13, 7, 75, 43);
        KOGTERVRANS[0] = new KogtervranStudents("Zhou", "Chang", 7, 78, 75, 14, 2, 46);
        KOGTERVRANS[1] = new KogtervranStudents("Padma", "Patil", 44, 78, 63, 22, 9, 80);
        KOGTERVRANS[2] = new KogtervranStudents("Marcus", "Belby", 25, 54, 20, 88, 52, 60);
        task();
    }

    private static void task() {
        GRIFINDORS[1].printStudents();
        SLIZERINS[2].printStudents();
        System.out.println(GRIFINDORS[1]);
        System.out.println(SLIZERINS[2]);
        System.out.println(PUPHEIDYIS[1]);
        System.out.println(KOGTERVRANS[0]);
        GRIFINDORS[2].comparePowerStudents(SLIZERINS[2]);
        GRIFINDORS[1].comparePowerGrifindorStudents(GRIFINDORS[2]);
        SLIZERINS[1].comparePowerSlizerinStudents(SLIZERINS[2]);
        KOGTERVRANS[1].comparePowerKogtervranStudents(KOGTERVRANS[2]);
        PUPHEIDYIS[1].comparePowerPupheydyiStudents(PUPHEIDYIS[2]);

    }


}
