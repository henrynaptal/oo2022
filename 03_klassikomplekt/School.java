public class School {
    public void Result(int testScore, String name) {
        if(testScore> 50 && testScore < 60) {
            System.out.println(name+" sai sisse kahte kooli.");
        } else if(testScore> 60 && testScore< 70) {
            System.out.println(name+" sai sisse nelja kooli.");
        } else if(testScore> 70 && testScore< 80) {
            System.out.println(name+" sai sisse viite kooli.");
        } else if(testScore> 80 && testScore< 90) {
            System.out.println(name+" sai sisse seitsmesse kooli.");
        } else if(testScore> 90){
            System.out.println(name+"Sai sisse igasse kooli.");
        } else {
            System.out.println(name+" kukkus läbi...");
        }
    }
}