package introcontrol;

import java.util.Scanner;

public class IntroControlMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntroControl introControl = new IntroControl();
        System.out.println(introControl.calculateConsumption(14445, 30000));
    }
}
