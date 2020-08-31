package _2_结构型模式._5_外观模式_Facade._1_注册公司;

public class Bank {
    public String openAccount(String companyId) {
        Integer account = (int)(Math.random() * 100) * 100 + Integer.parseInt(companyId);
        return String.valueOf(account);
    }
}
