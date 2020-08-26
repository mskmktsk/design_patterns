package _2_结构型模式._1_适配器模式_Adapter._2_对象适配器;

public class Voltage220V {
    public int output220V() {
        int src = 220;
        System.out.println("电压 =" + src + " V");
        return src;
    }
}
