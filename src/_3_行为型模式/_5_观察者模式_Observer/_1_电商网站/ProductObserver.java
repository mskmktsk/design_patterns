package _3_行为型模式._5_观察者模式_Observer._1_电商网站;

public interface ProductObserver {
    void onPublished(Product product);
    void onPriceChanged(Product product);
}
