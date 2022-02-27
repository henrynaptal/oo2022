public class Results {
    public static void main(String[] args) {
        School tulemus = new School();
        Student mart = new Student();
        int score = mart.StudentTestScore(73);
        String name = mart.StudentName("Jay");
        tulemus.Result(score, name);

    }
}