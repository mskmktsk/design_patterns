package _2_结构型模式._3_装饰器模式_Decorator._2_星巴克咖啡;

public abstract class Drink {
    private String desc;

    public abstract double cost();

    public String getDesc() {
        return desc;
    }

    protected void setDesc(String desc) {
        this.desc = desc;
    }
}
