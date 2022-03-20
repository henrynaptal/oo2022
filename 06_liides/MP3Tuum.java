public interface MP3Tuum{
    void play();
    void stop();

    default void setVolume(int helitase) {
        System.out.println("Helitase on: " + helitase + "%");
    }
}
