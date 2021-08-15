public class Grades {
    private final int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
        // size++ size += 1 lub size = size + 1
        // 0+1        0=0+1
    }

    public int last() {
        if (this.size == 10) {
        }
        return grades[size - 1];
    }

    public int average(int[] grades) {
        int result = 0;
        int size = 0;
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[i];
            // [1,2,3,4,5] - tablica z wartościami
            // dla i = 0
            // result = 0 + 1 bo grades[0] = 1
            // i = 1
            // result = 1 + 2 bo grades[1] = 3
            // i = 2
            // result = 3 + 3
            // i = 4
            // result = 0 + 1 + 2 + 3 + 4 + 5
        }
        int avg = result / this.size;
        return avg;
    }
}







