package _2_结构型模式._5_外观模式_Facade._1_注册公司;

public class Facade {
    private AdminOfIndustry admin = new AdminOfIndustry();
    private Bank bank = new Bank();
    private Taxation taxation = new Taxation();

    public Company openCompany(String name) {
        Company company = this.admin.register(name);
        String bankAccount = this.bank.openAccount(company.getId());
        company.setBank(bankAccount);
        String taxCode = this.taxation.applyTaxCode(company.getId());
        company.setTaxCode(taxCode);
        return company;
    }
}
