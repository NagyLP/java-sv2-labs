package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();
        Fish oneFish = new Fish("ponty", "kék");
        Fish twoFish = new Fish("ponty", "zöld");
        Fish thereFish = new Fish("keszeg", "piros");

        aquarium.addFish(oneFish);
        aquarium.addFish(twoFish);
        aquarium.addFish(thereFish);

        System.out.println(aquarium.getNumberOfFish());

        System.out.println("Virtuálisan létrehozott/példányosítatlan listához (üres objektumhoz/prototípushoz) " +
                "nem tud hozzáadni listaelemet, ezért a kivétel visszacsatol" +
                " az érkezett utasítás hívási lánácán/útvonalán (objektumok, metódusok).");

    }
}
