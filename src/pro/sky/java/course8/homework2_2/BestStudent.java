package pro.sky.java.course8.homework2_2;

public class BestStudent {

    public void theBestStudent(Hogwards[] HOGWARDS, String firstName, String firstSurname, String secondName, String secondSurname) {
        int firstPower = 0;
        int secondPower = 0;
        int firstdistanceTeleport = 0;
        int seconddistanceTeleport = 0;
        for (int i = 0; i < HOGWARDS.length; i++) {
            if (HOGWARDS[i].getName().equals(firstName) && HOGWARDS[i].getSurname().equals(firstSurname)) {
                firstPower = HOGWARDS[i].getPowerMagic();
                firstdistanceTeleport = HOGWARDS[i].getDistanceTeleport();
                break;
            }
        }
        for (int i = 0; i < HOGWARDS.length; i++) {
            if (HOGWARDS[i].getName().equals(secondName) && HOGWARDS[i].getSurname().equals(secondSurname)) {
                secondPower = HOGWARDS[i].getPowerMagic();
                seconddistanceTeleport = HOGWARDS[i].getDistanceTeleport();
                break;
            }
        }
        if (firstPower > secondPower) {
            System.out.println(firstName + " " + firstSurname + " более мощный волшебник, чем " + secondName + " " + secondSurname);
        } else if (secondPower > firstPower) {
            System.out.println(secondName + " " + secondSurname + " более мощный волшебник, чем " + firstName + " " + firstSurname);
        } else {
            System.out.println(firstName + " " + firstSurname + " и " + secondName + " " + secondSurname + " равны по мощи волщебства.");
        }

            if (firstdistanceTeleport > seconddistanceTeleport) {
                System.out.println(firstName + " " + firstSurname + " более мощный в трансгрессии, чем " + secondName + " " + secondSurname);
            } else if (seconddistanceTeleport > firstdistanceTeleport) {
                System.out.println(secondName + " " + secondSurname + " более мощный в трансгрессии, чем" + firstName + " " + firstSurname);
            } else {
                System.out.println(firstName + " " + firstSurname + " и " + secondName + " " + secondSurname + " равны в трансгрессии.");
            }

    }

    public void slizerinBestStudent(Slizerin[] SLIZERINS, String firstName, String firstSurname, String secondName, String secondSurname) {
        int firstPower = 0;
        int secondPower = 0;

        for (int i = 0; i < SLIZERINS.length; i++) {
            if (SLIZERINS[i].getName().equals(firstName) && SLIZERINS[i].getSurname().equals(firstSurname)) {
                firstPower = SLIZERINS[i].getCraftiness() + SLIZERINS[i].getResolute() + SLIZERINS[i].getAmbitiousness() + SLIZERINS[i].getResourcefulness()
                        + SLIZERINS[i].getLustOfPower();
                break;
            }
        }

        for (int i = 0; i < SLIZERINS.length; i++) {
            if (SLIZERINS[i].getName().equals(secondName) && SLIZERINS[i].getSurname().equals(secondSurname)) {
                secondPower = SLIZERINS[i].getCraftiness() + SLIZERINS[i].getResolute() + SLIZERINS[i].getAmbitiousness() + SLIZERINS[i].getResourcefulness()
                        + SLIZERINS[i].getLustOfPower();
                break;
            }
        }
        if (firstPower > secondPower) {
            System.out.println(firstName + " " + firstSurname + " лучший Слизеринец, чем " + secondName + " " + secondSurname);
        } else if (secondPower > firstPower) {
            System.out.println(secondName + " " + secondSurname + " лучший Слизеринец, чем " + firstName + " " + firstSurname);
        } else {
            System.out.println("Они равны)");
        }
    }

    public void grifindorBestStudent(Grifindor[] GRIFINDORS, String firstName, String firstSurname, String secondName, String secondSurname) {
        int firstPower = 0;
        int secondPower = 0;

        for (int i = 0; i < GRIFINDORS.length; i++) {
            if (GRIFINDORS[i].getName().equals(firstName) && GRIFINDORS[i].getSurname().equals(firstSurname)) {
                firstPower = GRIFINDORS[i].getHonor() + GRIFINDORS[i].getBravery() + GRIFINDORS[i].getNobility();
                break;
            }
        }

        for (int i = 0; i < GRIFINDORS.length; i++) {
            if (GRIFINDORS[i].getName().equals(secondName) && GRIFINDORS[i].getSurname().equals(secondSurname)) {
                secondPower = GRIFINDORS[i].getHonor() + GRIFINDORS[i].getBravery() + GRIFINDORS[i].getNobility();
                break;
            }
        }
        if (firstPower > secondPower) {
            System.out.println(firstName + " " + firstSurname + " лучший Гриффиндорец, чем " + secondName + " " + secondSurname);
        } else if (secondPower > firstPower) {
            System.out.println(secondName + " " + secondSurname + " лучший Гриффиндорец, чем " + firstName + " " + firstSurname);
        } else {
            System.out.println("Они равны)");
        }
    }

    public void pupheidyiBestStudent(Pupheidyi[] PUPHEIDYI, String firstName, String firstSurname, String secondName, String secondSurname) {
        int firstPower = 0;
        int secondPower = 0;

        for (int i = 0; i < PUPHEIDYI.length; i++) {
            if (PUPHEIDYI[i].getName().equals(firstName) && PUPHEIDYI[i].getSurname().equals(firstSurname)) {
                firstPower = PUPHEIDYI[i].getHardworking() + PUPHEIDYI[i].getFaithful() + PUPHEIDYI[i].getTruthful();
                break;
            }
        }

        for (int i = 0; i < PUPHEIDYI.length; i++) {
            if (PUPHEIDYI[i].getName().equals(secondName) && PUPHEIDYI[i].getSurname().equals(secondSurname)) {
                secondPower = PUPHEIDYI[i].getHardworking() + PUPHEIDYI[i].getFaithful() + PUPHEIDYI[i].getTruthful();
                break;
            }
        }
        if (firstPower > secondPower) {
            System.out.println(firstName + " " + firstSurname + " лучший Пуффендуец, чем " + secondName + " " + secondSurname);
        } else if (secondPower > firstPower) {
            System.out.println(secondName + " " + secondSurname + " лучший Пуффендуец, чем " + firstName + " " + firstSurname);
        } else {
            System.out.println("Они равны)");
        }
    }

    public void kogtervranBestStudent(Kogtervran[] KOGTERVRAN, String firstName, String firstSurname, String secondName, String secondSurname) {
        int firstPower = 0;
        int secondPower = 0;

        for (int i = 0; i < KOGTERVRAN.length; i++) {
            if (KOGTERVRAN[i].getName().equals(firstName) && KOGTERVRAN[i].getSurname().equals(firstSurname)) {
                firstPower = KOGTERVRAN[i].getSmart() + KOGTERVRAN[i].getFullOfCreativity() + KOGTERVRAN[i].getWise() + KOGTERVRAN[i].getWitty();
                break;
            }
        }

        for (int i = 0; i < KOGTERVRAN.length; i++) {
            if (KOGTERVRAN[i].getName().equals(secondName) && KOGTERVRAN[i].getSurname().equals(secondSurname)) {
                secondPower = KOGTERVRAN[i].getSmart() + KOGTERVRAN[i].getFullOfCreativity() + KOGTERVRAN[i].getWise() + KOGTERVRAN[i].getWitty();
                break;
            }
        }
        if (firstPower > secondPower) {
            System.out.println(firstName + " " + firstSurname + " лучший Когтевранец, чем " + secondName + " " + secondSurname);
        } else if (secondPower > firstPower) {
            System.out.println(secondName + " " + secondSurname + " лучший Когтевранец, чем " + firstName + " " + firstSurname);
        } else {
            System.out.println("Они равны)");
        }
    }

}

