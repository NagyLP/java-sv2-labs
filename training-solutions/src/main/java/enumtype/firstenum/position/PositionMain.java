package enumtype.firstenum.position;

public class PositionMain {

    public void test () {
          for (Position item:Position.values()) {
              System.out.println(item.ordinal()+1 +". :"+ item.name() +" - Fizetés: "+ item.getSalary() +" - Juttat ás: " +item.getBenefit());
          }
    }

    public static void main(String[] args) {

        for (Position item:Position.values()) {
            System.out.println(item.ordinal()+1 +". :"+ item.name() +"\n"+ "Fizetés: " +item.getSalary() +"; Juttat ás: " +item.getBenefit());

            System.out.println();

            PositionMain positionMain = new PositionMain();
            positionMain.test();
        }
    }
}
