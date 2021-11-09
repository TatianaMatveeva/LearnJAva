package Range;

import java.util.Scanner;

public class aboutSwitch {
    public static void main(String[] args) {
        short item;
        System.out.println("0-escape of program\n1 - area of a triangle\n2 - area of a rectangle ");
        Scanner in = new Scanner(System.in);
        item = in.nextShort();

        switch (item){
            case 1: System.out.println("select the area of a triangle");
            case 2: System.out.println("select the area of a rectangle");

            default: System.out.println("doesn't select one of menu");
        }
        in.close();

    }
}
