package _2_结构型模式._2_桥接模式_Bridge;

public abstract class Car {
    // 引用 Engine
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
