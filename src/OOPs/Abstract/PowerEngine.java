package OOPs.Abstract;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("PowerEngine engine is starting...");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine engine is stopping...");
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine engine is accelerating...");
    }
}
