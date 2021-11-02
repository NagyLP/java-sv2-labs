package stringconcat.nameconcat;

public class NameMain {

    public static void main(String[] args) {

        System.out.println(new Name("Dezsőfi", "Rajz", "Kamilla",Title.DR).concatNameHungarianStyle()+"\n");
        System.out.println(new Name("Dezsőfi", "Rajz", "Kamilla",Title.DR).concatNameWesternStyle()+"\n");
        System.out.println(new Name("Dezsőfi","" , "Kamilla",Title.DR).concatNameWesternStyle()+"\n");
        System.out.println(new Name("Dezsőfi", "Rajz", "Kamilla",null).concatNameWesternStyle()+"\n");


    }
}
