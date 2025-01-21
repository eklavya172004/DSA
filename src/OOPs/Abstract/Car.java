package OOPs.Abstract;

public class Car implements Engine,Brake{
    @Override
    public void brake() {
        System.out.println("I brake the car");
    }

    @Override
    public void start() {
        System.out.println("I start the Car");
    }

    @Override
    public void stop() {
        System.out.println("I stopped the car");
    }

    @Override
    public void acc() {
        System.out.println("I acc the car");
    }
}
