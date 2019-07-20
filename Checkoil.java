import java.util.*;

public class Checkoil{

    public static void main(String[] args) {

        System.out.println("x");

        Scanner sc = new Scanner(System.in);
        Float liter = sc.nextFloat();

        if (liter < 2) {
            System.out.println("x");
        } else {
            System.out.println("o");
        }
    }
}