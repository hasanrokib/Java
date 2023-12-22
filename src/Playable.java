public interface Playable {
    void play();
}
class  Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("Strumming the guitar...");
    }
}
class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("Playing the piano...");
    }
}
