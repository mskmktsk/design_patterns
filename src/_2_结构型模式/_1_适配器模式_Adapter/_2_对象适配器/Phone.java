package _2_结构型模式._1_适配器模式_Adapter._2_对象适配器;

public class Phone {
    public void changing(Voltage5V voltage) {
        if (voltage.output5V() == 5) {
            System.out.println("电压为 5V，可以充电！");
        } else {
            System.out.println("电压大于 5V，不可以充电！");
        }
    }
}
