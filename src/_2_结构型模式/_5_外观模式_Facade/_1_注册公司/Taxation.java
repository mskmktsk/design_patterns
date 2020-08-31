package _2_结构型模式._5_外观模式_Facade._1_注册公司;

import java.util.UUID;

public class Taxation {
    public String applyTaxCode(String companyId) {
        Integer taxCode = (int)(Math.random() * 100) * 100 + Integer.parseInt(companyId);
        return taxCode.toString();
    }
}
