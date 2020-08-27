package _2_结构型模式._2_桥接模式_Bridge;

public class Main {
    public static void main(String[] args) {
        RefindCar hongqiCar = new HongqiCar(new HongqiEngine());
        hongqiCar.drive();
    }
}
