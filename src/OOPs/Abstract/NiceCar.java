package OOPs.Abstract;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public  NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void musicstart(){
        player.play();
    }
    public void musicstop(){
        player.stop();
    }

    public void upgradedEngine(){
        this.engine = new Electrical();
    }
}
