public class User {
    String name;
    int age;
    static int avg;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //    avg = anna.averageAge(users);
    //    betty.lessThenAverageAge(users);


    private int averageAge(User[] users) {
        int result = 0;
        System.out.println(avg);
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        avg = result / users.length;
        return avg;
    }

    public void lessThenAverageAge(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < avg) {
                System.out.println();
            }
        }
    }


}
