package UsingIfSwitch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short item = -1;
        Scanner in = new Scanner(System.in);
        System.out.print("1 area of a triangle\n2 - area of a rectangle");
        item = in.nextShort();

        double h, a, S = 0;
        if (item == 1) {
            System.out.println("Enter the height and base of the triangle");
            h = in.nextDouble();
            a = in.nextDouble();
            S = 0.5*h*a;
        }
        else if (item == 2) {
            System.out.println("Enter the height and base of the rectangle");
            h = in.nextDouble();
            a = in.nextDouble();
            S = h * a;
        }

        System.out.println("Area of rectangle is: " + S);
        in.close();
    }


}
