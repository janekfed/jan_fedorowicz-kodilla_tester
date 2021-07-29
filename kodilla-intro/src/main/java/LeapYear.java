import java.util.Scanner;

public class LeapYearTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rok (minus przed rokiem dla lat p.n.e.):");
        int leapYear = sc.nextInt();

        if (leapYear >= -238 && leapYear % 4 == 0 || leapYear % 100 == 0 && leapYear % 400 == 0) {
            System.out.println("Rok przestępny");
        }
        if (leapYear < -238) {
            System.out.println("Rok przestępny wprowadzono dopiero w 258 r.p.n.e. ");
        }
        else {
            System.out.println("Rok nie jest przestępny");
        }
    }
}