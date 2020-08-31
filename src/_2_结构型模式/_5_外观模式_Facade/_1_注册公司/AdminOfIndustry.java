package _2_结构型模式._5_外观模式_Facade._1_注册公司;

public class AdminOfIndustry {
    public Company register(String name) {
        Company company = new Company();
        company.setName(name);
        company.setId(createCompanyId());
        return company;
    }

    private String createCompanyId() {
        return String.valueOf((int)(Math.random() * 100));
    }
}
