package enumtype.firstenum.solarsystem;

import enumtype.firstenum.Oceans;

import java.util.Arrays;

public class SolarSystemMain {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(SolarSytem.values())+"\n");

        for (int i = 0; i< SolarSytem.values().length; i++) {
            System.out.println(i+1 +".: "+ SolarSytem.valueOf(SolarSytem.values()[i].name()) +"- Holdjai: "+ SolarSytem.values()[i].getMoon());
        }

        System.out.println();

        for (SolarSytem item:SolarSytem.values())
            System.out.println(item.ordinal()+1+".: "+item.name()+ " - Holdjai: "+item.getMoon());
    }
}
