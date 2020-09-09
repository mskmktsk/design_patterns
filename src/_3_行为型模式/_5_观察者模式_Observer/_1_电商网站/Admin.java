package _3_行为型模式._5_观察者模式_Observer._1_电商网站;

public class Admin implements ProductObserver {
    public void onPublished(Product product) {
        System.out.println("你网站下的商店又有新产品了，快来看看！产品名称：" + product.getName() + "产品价格：" + product.getPrice());
    }

    public void onPriceChanged(Product product) {
        System.out.println("你网站下的商店产品价格修改了，快来看看！产品名称：" + product.getName() + "产品价格：" + product.getPrice());
    }
}
