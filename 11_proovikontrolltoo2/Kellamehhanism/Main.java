import java.math.*;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Kellamehhanism m = new Kellamehhanism();      
        for (int i = 0; i < 62; i++){
            int periood = (int)m.v6nkeperiood(1);
            if(i == 20){
                System.out.println("ESIMENE RING");
            } else if(i == 30) {
                System.out.println("TEINE RING");
            } else if(i == 40){
                System.out.println("ESIMENE RING");
            } else if(i == 61){
                i = 0;
                System.out.println("ESIMENE RING");
                System.out.println("TEINE RING");
            }
            System.out.println("tiksss " + i);
            Thread.sleep(periood * 100);
        }
    }
}