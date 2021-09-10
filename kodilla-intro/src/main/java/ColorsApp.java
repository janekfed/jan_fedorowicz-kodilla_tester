import java.util.Scanner;

public class ColorsApp {

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose color and enter its first letter.");
            String colors = scanner.nextLine().trim().toUpperCase();

            String colorString;
            switch (colors) {
                case "R":
                    colorString = "Red";
                    break;
                case "Y":
                    colorString = "Yellow";
                    break;
                case "W":
                    colorString = "White";
                    break;
                case "S":
                    colorString = "Silver";
                    break;
                case "V":
                    colorString = "Violet";
                    break;
                case "B":
                    colorString = "Blue, Black";
                    break;
                case "O":
                    colorString = "Orange";
                    break;
                case "G":
                    colorString = "Green, Grey";
                    break;
                default:
                    colorString = "Wrong letter. Try again.";
                    break;
            }
            System.out.println(colorString);
        }
    }
}