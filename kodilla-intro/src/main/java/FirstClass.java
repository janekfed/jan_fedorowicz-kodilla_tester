public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println(notebook.year + "y " + notebook.price + "zł " + notebook.weight + "g");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
        System.out.println();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2010);
        System.out.println(heavyNotebook.year + "y " + heavyNotebook.price + "zł " + heavyNotebook.weight + "g");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();
        System.out.println();

        Notebook oldNotebook = new Notebook(1600, 500,2000);
        System.out.println(oldNotebook.year + "y " + oldNotebook.price + "zł " + oldNotebook.weight + "g");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
        System.out.println();
    }
}