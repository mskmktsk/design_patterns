package _2_结构型模式._1_适配器模式_Adapter._3_接口适配器;

interface Voltage220V {
    default int output220V() {
        int src = 220;
        System.out.println("电压 =" + src + " V");
        return src;
    }
}
