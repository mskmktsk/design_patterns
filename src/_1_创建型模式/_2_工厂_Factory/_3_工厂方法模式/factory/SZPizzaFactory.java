package _1_创建型模式._2_工厂_Factory._3_工厂方法模式.factory;

import _1_创建型模式._2_工厂_Factory._3_工厂方法模式.pizza.Pizza;
import _1_创建型模式._2_工厂_Factory._3_工厂方法模式.pizza.SZCheesePizza;
import _1_创建型模式._2_工厂_Factory._3_工厂方法模式.pizza.SZPepperPizza;

public class SZPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String orderType) {
        if (orderType == null) {
            return null;
        }
        Pizza pizza;
        String type = orderType.toLowerCase();
        if ("cheese".equals(type)) {
            pizza = new SZCheesePizza();
        } else if ("pepper".equals(type)) {
            pizza = new SZPepperPizza();
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