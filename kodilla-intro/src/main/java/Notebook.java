public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("Very cheap.");
        }
        else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("Good price.");
        } else {
            System.out.println("Expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("Light notebook.");
        }
        else if (this.weight >= 700 && this.weight <= 1500) {
            System.out.println("Very heavy.");
        } else {
            System.out.println("Too heavy.");
        }
    }
    public void checkYear() {
        if (this.price < 1200 && this.year > 2018) {
            System.out.println("New and cheap notebook.");
        }
        else if (this.price > 1200 && this.year > 2009 && this.year < 2018) {
            System.out.println("Costly and not so new.");
        }
        else if (this.price < 700 && this.year < 2001) {
            System.out.println("Old and cheap notebook.");
        }
    }
}