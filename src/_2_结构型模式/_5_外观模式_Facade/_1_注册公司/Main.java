package _2_结构型模式._5_外观模式_Facade._1_注册公司;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        Company company = facade.openCompany("外观模式");
        System.out.println(company);
    }
}
