package _2_结构型模式._2_桥接模式_Bridge;

public class HongqiCar extends RefindCar {
    public HongqiCar(Engine engine) {
        super(engine);
    }

    @Override
    public String getBrand() {
        return "Hongqi";
    }
}
