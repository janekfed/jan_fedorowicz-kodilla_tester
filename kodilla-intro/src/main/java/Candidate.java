public class Candidate {
    public static void main(String[] args) {
        Application adam = new Application("Adam", 40.5, 178);
        System.out.println(adam.name);
        adam.candidateGroup();
        System.out.println();
    }
}
