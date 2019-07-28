import java.util.*;

public class BuyTicket {

    public static void main(String[] args) {

        System.out.print("97:a, 44:A, 55:L, 68:Y, else ERROR ");

        Scanner sc = new Scanner(System.in);

        int choicen = sc.nextInt();
        // System.out.print(choicen);
        switch (choicen) {
        case 97:
            System.out.println("a");
            break;
        case 44:
            System.out.println("A");
            break;
        case 55:
            System.out.println("L");
            break;
        case 68:
            System.out.println("Y");
            break;
                default:
            System.out.print("error");

        }
    }

}