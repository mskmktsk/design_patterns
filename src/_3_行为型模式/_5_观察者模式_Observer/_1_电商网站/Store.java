package _3_行为型模式._5_观察者模式_Observer._1_电商网站;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
    private List<ProductObserver> observers;
    private Map<String, Product> products;

    public Store() {
        this.observers = new ArrayList<>();
        this.products = new HashMap<>();
    }

    public void registerObserver(ProductObserver o) {
        this.observers.add(o);
    }

    public void removeObserver(ProductObserver o) {
        this.observers.remove(o);
    }

    public void addNewProduct(String name, double price) {
        Product p = new Product(name, price);
        this.products.put(name, p);
        if (observers.isEmpty()) return;
        observers.forEach(o -> new Thread() {
            @Override
            public void run() {
                o.onPublished(p);
            }
        }.start());
    }

    public void setProductPrice(String name, double price) {
        Product p = this.products.get(name);
        p.setPrice(price);
        if (observers.isEmpty()) return;
        observers.forEach(o -> new Thread() {
            @Override
            public void run() {
                o.onPriceChanged(p);
            }
        }.start());
    }
}
