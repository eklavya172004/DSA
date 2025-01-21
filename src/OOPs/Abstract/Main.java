package OOPs.Abstract;

public class Main {
    public static void main(String[] args) {
//        Son son = new Son(23);

//        son.career();
//        son.normal();
//        son.partner("sanjana");
//
//
//        Car car = new Car();
//
//        car.start();
//        car.acc();
//        car.stop();

//        CDPlayer music = new CDPlayer();
//        music.play();
//        music.stop();
        NiceCar car = new NiceCar();
        car.start();
        car.stop();
        car.upgradedEngine();
        car.start();
        car.stop();
    }
}
