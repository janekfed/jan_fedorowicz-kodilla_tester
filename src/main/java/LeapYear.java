public class LeapYear {
    public static void main(String[] args) {
        int rokPrzestepny = 2012;
        if (rokPrzestepny % 4 == 0 && rokPrzestepny % 100 == 0 && rokPrzestepny % 400 == 0) {
            System.out.println("Rok przestępny");
        }
        else {
            System.out.println("Rok nieprzestępny");
        };
    }
}