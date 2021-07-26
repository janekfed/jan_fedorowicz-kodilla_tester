public class LeapYear {
    public static void main(String[] args) {

        if (366 % 2 == 0) {
            System.out.println("Rok przestępny");
        }
        else if (366 % 3 == 0 && 365 % 73 == 1); {
            System.out.println("Rok nieprzestępny");
        }
    }
}