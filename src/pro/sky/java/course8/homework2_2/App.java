package pro.sky.java.course8.homework2_2;

public class App {
    private static final Hogwards[] HOGWARDS = new Hogwards[12];
    private static final Slizerin[] SLIZERINS = new Slizerin[3];
    private static final Grifindor[] GRIFINDORS = new Grifindor[3];
    private static final Pupheidyi[] PUPHEIDYIS = new Pupheidyi[3];
    private static final Kogtervran[] KOGTERVRANS = new Kogtervran[3];


    public static void main(String[] args) {
        HOGWARDS[0] = new Hogwards("Draco", "Malfoy", 48, 60);
        HOGWARDS[1] = new Hogwards("Grehem", "Montegru", 75, 54);
        HOGWARDS[2] = new Hogwards("Gregori", "Goyl", 37, 76);
        HOGWARDS[3] = new Hogwards("Harry", "Potter", 89, 50);
        HOGWARDS[4] = new Hogwards("Hermiona", "Grendjer", 99, 99);
        HOGWARDS[5] = new Hogwards("Ron", "Weasley", 10, 10);
        HOGWARDS[6] = new Hogwards("Zaharia", "Smit", 60, 68);
        HOGWARDS[7] = new Hogwards("Sedric", "Diggori", 82, 56);
        HOGWARDS[8] = new Hogwards("Justin", "Finch-Fletchley", 31, 13);
        HOGWARDS[9] = new Hogwards("Zhou", "Chang", 7, 78);
        HOGWARDS[10] = new Hogwards("Padma", "Patil", 44, 78);
        HOGWARDS[11] = new Hogwards("Marcus", "Belby", 25, 54);
        SLIZERINS[0] = new Slizerin("Draco", "Malfoy", 48, 60, 92, 56, 50, 21, 99);
        SLIZERINS[1] = new Slizerin("Grehem", "Montegru", 75, 54, 40, 26, 40, 23, 37);
        SLIZERINS[2] = new Slizerin("Gregori", "Goyl", 37, 76, 85, 65, 64, 74, 68);
        GRIFINDORS[0] = new Grifindor("Harry", "Potter", 89, 50, 99, 99, 99);
        GRIFINDORS[1] = new Grifindor("Hermiona", "Grendjer", 99, 99, 25, 10, 36);
        GRIFINDORS[2] = new Grifindor("Ron", "Weasley", 10, 10, 50, 60, 70);
        PUPHEIDYIS[0] = new Pupheidyi("Zaharia", "Smit", 60, 68, 51, 28, 9);
        PUPHEIDYIS[1] = new Pupheidyi("Sedric", "Diggori", 82, 56, 78, 80, 71);
        PUPHEIDYIS[2] = new Pupheidyi("Justin", "Finch-Fletchley", 31, 13, 7, 75, 43);
        KOGTERVRANS[0] = new Kogtervran("Zhou", "Chang", 7, 78, 75, 14, 2, 46);
        KOGTERVRANS[1] = new Kogtervran("Padma", "Patil", 44, 78, 63, 22, 9, 80);
        KOGTERVRANS[2] = new Kogtervran("Marcus", "Belby", 25, 54, 20, 88, 52, 60);
        task();
    }

    private static void task() {
        PrintStudents printStudents = new PrintStudents();
        printStudents.slizerinPrintStudents(SLIZERINS, "Grehem", "Montegru");
        printStudents.grifindorPrintStudents(GRIFINDORS, "Harry", "Potter");
        printStudents.puphendyiPrintStudents(PUPHEIDYIS, "Sedric", "Diggori");
        printStudents.kogtervranPrintStudents(KOGTERVRANS, "Padma", "Patil");
        BestStudent bestStudent = new BestStudent();
        bestStudent.theBestStudent(HOGWARDS,"Harry", "Potter", "Draco", "Malfoy");
        bestStudent.slizerinBestStudent(SLIZERINS, "Gregori", "Goyl", "Grehem", "Montegru");
        bestStudent.grifindorBestStudent(GRIFINDORS, "Harry", "Potter", "Hermiona", "Grendjer");
        bestStudent.pupheidyiBestStudent(PUPHEIDYIS, "Sedric", "Diggori", "Justin", "Finch-Fletchley");
        bestStudent.kogtervranBestStudent(KOGTERVRANS, "Zhou", "Chang", "Marcus", "Belby");

    }


}
