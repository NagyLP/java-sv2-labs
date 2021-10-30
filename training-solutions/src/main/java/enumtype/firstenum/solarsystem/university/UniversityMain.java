package enumtype.firstenum.solarsystem.university;

import enumtype.firstenum.solarsystem.SolarSytem;

public class UniversityMain {
    public static void main(String[] args) {

        for (University item:University.values()) {
            System.out.println(item.ordinal()+1 +".: "+ item.name() +" - "+ item.getName());
        }
        System.out.println();
    }
}
