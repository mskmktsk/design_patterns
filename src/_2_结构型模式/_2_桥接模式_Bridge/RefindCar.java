package _2_结构型模式._2_桥接模式_Bridge;

public abstract class RefindCar extends Car {
    public RefindCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        this.engine.start();
        System.out.printf("Drive %s car...", getBrand());
    }

    public abstract String getBrand();
}
