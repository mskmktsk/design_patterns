package _1_创建型模式._2_工厂_Factory._3_工厂方法模式.factory;

import _1_创建型模式._2_工厂_Factory._3_工厂方法模式.pizza.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String orderType);

    /**
     * 根据字符串自选工厂
     * @param city 城市名称
     * @return 工厂实例
     */
    static PizzaFactory getFactory(String city) {
        if (city == null) {
            return null;
        }
        PizzaFactory factory = null;
        String c = city.toLowerCase();
        if ("sz".equals(c)) {
            factory = new SZPizzaFactory();
        } else if ("ld".equals(c)) {
            factory = new LDPizzaFactory();
        }
        return factory;
    }
}
