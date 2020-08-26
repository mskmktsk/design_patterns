package _2_结构型模式._1_适配器模式_Adapter._2_对象适配器;

public class client {
    public static void main(String[] args) {
        System.out.println("=== 对象适配模式 ===");
        Phone phone = new Phone();
        phone.changing(new VoltageAdapter(new Voltage220V()));
    }
}
