package OOPs.Abstract;

public class CDPlayer implements Media{

    @Override
    public void play() {
        System.out.print("start the music");
    }

    @Override
    public void stop() {
        System.out.println("Stopped the Car");
    }
}
