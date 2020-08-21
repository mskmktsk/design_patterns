package _1_创建型模式._2_工厂_Factory._3_工厂方法模式.factory;

import _1_创建型模式._2_工厂_Factory._3_工厂方法模式.pizza.LDCheesePizza;
import _1_创建型模式._2_工厂_Factory._3_工厂方法模式.pizza.LDPepperPizza;
import _1_创建型模式._2_工厂_Factory._3_工厂方法模式.pizza.Pizza;

public class LDPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String orderType) {
        if (orderType == null) {
            return null;
        }
        Pizza pizza;
        String type = orderType.toLowerCase();
        if ("cheese".equals(type)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(type)) {
            pizza = new LDPepperPizza();
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