package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kernel {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Németjuhász", 1, "rajzos");
        Dog dog2 = new Dog("Szomszédok_Kutya", 75, "európai");
        Dog dog3 = new Dog("Belgajuhász", 2, "barna-vörös rajzos");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
//        System.out.println(dogs);

        Dog dog4 = dogs.get(1);
        dog4.setClour("kék");
//        System.out.println(dogs);

        Dog dog5 = new Dog("GyereIdeTakarodj", 1, "rajzos");
//        System.out.println(dog5);

        dog5 = dog1;
// dog5 = dog1.get(1);
//        System.out.println(dogs);
//        System.out.println(dog5);

        dogs.add(dog5);
//        System.out.println(dogs);

        Dog dog6 = dog4;
//        Dog dog6 = dogs.get(4);
        dog6.setClour("négyzethálós");
//        System.out.println(dogs);

        List<Dog> dogs2 = new ArrayList<>(dogs);
        Dog dog7 = dog4;
        dog7.setClour("KRIKSZ-KRAKSZOS");
//        System.out.println(dogs2);

        dog2 = null;
//        System.out.println(dogs2);

       Dog dog8 = dogs.get(1);
       dog8 = null;
//       System.out.println(dogs2);
//        System.out.println(dog8);
//        System.out.println(dog2);

        Dog dog9 = dogs.get(1);

        dog9.setClour("mintha-vörös");
        System.out.println(dogs2);
        }
}
