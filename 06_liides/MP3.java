public class MP3 implements MP3Tuum{
    public void play(){
        System.out.println("Muusika mängib...");
    }
    
    public void stop(){
        System.out.println("Muusika on pausile pandud...");
    }

    public void setVolume(int helitase){
        if (helitase <= 100){
            System.out.println("Helitase on: " + helitase + "%");
        } else {
            System.out.println("Helitase on maksimumi peal.");
        }
    }
}