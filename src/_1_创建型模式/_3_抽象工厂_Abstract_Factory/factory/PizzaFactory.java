package _1_创建型模式._3_抽象工厂_Abstract_Factory.factory;

import _1_创建型模式._3_抽象工厂_Abstract_Factory.pizza.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String orderType);
}
