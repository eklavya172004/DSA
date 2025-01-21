package OOPs.Abstract;

public class Electrical implements Engine {

    @Override
    public void start() {
        System.out.println("Electrical engine is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electrical engine is stopping...");
    }

    @Override
    public void acc() {
        System.out.println("Electrical engine is accelerating...");
    }
}
