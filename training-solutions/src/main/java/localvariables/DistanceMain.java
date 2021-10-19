package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distanceN = new Distance(100.57864, true);

        System.out.println("Távolság: " +distanceN.getDistancelnKM()+ " Pontos: " +distanceN.isExact());

        int integerDistancelnKM = (int) distanceN.getDistancelnKM();
        System.out.println("Távolság kasztova (cast), egészértére kifejezve: " +integerDistancelnKM);


    }
}
