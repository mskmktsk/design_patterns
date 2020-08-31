package _2_结构型模式._5_外观模式_Facade._1_注册公司;

public class Company {
    private String name;
    private String id;
    private String bank;
    private String taxCode;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", bank='" + bank + '\'' +
                ", taxCode='" + taxCode + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
}
