package Range;

import java.util.Scanner;
public class negativerange {

    public static void main(String[] args) {
        double a;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();

        if (a < -2 || a > 5) System.out.println("a isn't [-2; 5]");

        in.close();

    }
}
