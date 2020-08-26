package _2_结构型模式._1_适配器模式_Adapter._3_接口适配器;

import java.util.Objects;

public class VoltageAdapter implements Voltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = Objects.requireNonNull(voltage220V);
    }

    @Override
    public int output5V() {
        int srcV = voltage220V.output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
