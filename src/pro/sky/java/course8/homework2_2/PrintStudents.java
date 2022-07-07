package pro.sky.java.course8.homework2_2;

public class PrintStudents {
    public void slizerinPrintStudents(Slizerin[] SLIZERINS, String name, String surname) {
        for (int i = 0; i < SLIZERINS.length; i++) {
            if (SLIZERINS[i].getName().equals(name) && SLIZERINS[i].getSurname().equals(surname)) {
                System.out.println("Имя - " + name + ". Фамилия - " + surname + ". Мощность магии - " + SLIZERINS[i].getPowerMagic() + ". Мощность телепорта - "
                        + SLIZERINS[i].getDistanceTeleport() + ". Хитрость - " + SLIZERINS[i].getCraftiness() + ". Решительность - " + SLIZERINS[i].getResolute() +
                        ". Амбициозность - " + SLIZERINS[i].getAmbitiousness() + ". Находчивость  - " + SLIZERINS[i].getResourcefulness()
                        + ". Жажда власти -  " + SLIZERINS[i].getLustOfPower());
                break;
            }
        }
    }

    public void grifindorPrintStudents(Grifindor[] GRIFINDORS, String name, String surname) {
        for (int i = 0; i < GRIFINDORS.length; i++) {
            if (GRIFINDORS[i].getName().equals(name) && GRIFINDORS[i].getSurname().equals(surname)) {
                System.out.println("Имя - " + name + ". Фамилия - " + surname + ". Мощность магии - " + GRIFINDORS[i].getPowerMagic() + ". Мощность телепорта - "
                        + GRIFINDORS[i].getDistanceTeleport() + ". Честь - " + GRIFINDORS[i].getHonor() + ". Благородство - " + GRIFINDORS[i].getNobility() +
                        ". Храбрость - " + GRIFINDORS[i].getBravery());
                break;
            }
        }
    }
    public void puphendyiPrintStudents(Pupheidyi[] PUPHEINDYI, String name, String surname) {
        for (int i = 0; i < PUPHEINDYI.length; i++) {
            if (PUPHEINDYI[i].getName().equals(name) && PUPHEINDYI[i].getSurname().equals(surname)) {
                System.out.println("Имя - " + name + ". Фамилия - " + surname + ". Мощность магии - " + PUPHEINDYI[i].getPowerMagic() + ". Мощность телепорта - "
                        + PUPHEINDYI[i].getDistanceTeleport() + ". Трудолюбие - " + PUPHEINDYI[i].getHardworking() + ". Чесность - " + PUPHEINDYI[i].getTruthful() +
                        ". Верность - " + PUPHEINDYI[i].getFaithful());
                break;
            }
        }
    }
    public void kogtervranPrintStudents(Kogtervran[] KOGTERVRAN, String name, String surname) {
        for (int i = 0; i < KOGTERVRAN.length; i++) {
            if (KOGTERVRAN[i].getName().equals(name) && KOGTERVRAN[i].getSurname().equals(surname)) {
                System.out.println("Имя - " + name + ". Фамилия - " + surname + ". Мощность магии - " + KOGTERVRAN[i].getPowerMagic() + ". Мощность телепорта - "
                        + KOGTERVRAN[i].getDistanceTeleport() + ". Остроумность - " + KOGTERVRAN[i].getWitty() + ". Креативность - " + KOGTERVRAN[i].getFullOfCreativity() +
                        ". Ум - " + KOGTERVRAN[i].getSmart()+ ". Мудрость - " + KOGTERVRAN[i].getWise());
                break;
            }
        }
    }
}
