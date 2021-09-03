public class RandomNumbers {


    public static void main(String[] args) {

        int result = 0;
        int sum = 0;
        int maxSum = 5000;
        int resultRandom = result;
        int min = 0;
        int max = 31;


        RandomNumbers r = new RandomNumbers();
        int[] tab = new int[31];
        System.out.println("Program wyszukuje spośród wylosowanych liczb najmniejsza i najwieksza ");

        while (sum <= maxSum) {
            int random = r.nextInt(31);
            sum = sum + random;
            result++;
        }

//   ----- ver. 2 -----
//    public int random() {
//        Random r = new Random();
//        int random = r.nextInt(tab[31]);
//        for (int sum = 0; sum <= 5000; sum = sum + random) {
//            System.out.println();
//        }
//    }

        for (tab[min] = 0; tab[min] <= tab.length; tab[min]++) {
            if (tab[min] == min) {
                System.out.println("Najmniejsza wartość wynosi: " + min);
            }
        }
        for (tab[min] = 0; tab[min] <= tab.length; tab[min]++) {
            if (tab[min] == max) {
                System.out.println("Największa wartość wynosi: " + max);
            }
        }

    }

    private int nextInt(int i) {
        return 0;
    }
}