// the conditions for task
// to check a range a = [-2;5]

package Range;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();

        if (a >= -2 && a <= 5)
            System.out.println("a is [-2; 5]");

        in.close();
    }
}
