package _1_创建型模式._2_工厂_Factory._2_简单工厂模式_订购披萨.order;

import _1_创建型模式._2_工厂_Factory._2_简单工厂模式_订购披萨.pizza.CheesePizza;
import _1_创建型模式._2_工厂_Factory._2_简单工厂模式_订购披萨.pizza.GreekPizza;
import _1_创建型模式._2_工厂_Factory._2_简单工厂模式_订购披萨.pizza.Pizza;

public class PizzaFactory {
    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else {
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
