package Range;

public class rangeForXandY {
    public static void main(String[] args) {
        int x = -1, y = 5;
        if ((x < 0 || x > 2) && y >= 5 && y <=7)
            System.out.println("x isn't [0; 2], y is [5; 7]");
    }
}
