package _3_行为型模式._5_观察者模式_Observer._1_电商网站;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();

        Customer customer = new Customer();
        Admin admin = new Admin();

        store.registerObserver(customer);
        store.registerObserver(admin);

        store.addNewProduct("芒果干", 18.8);
        store.addNewProduct("牛肉干", 35.5);

        store.setProductPrice("芒果干", 20);
    }
}
