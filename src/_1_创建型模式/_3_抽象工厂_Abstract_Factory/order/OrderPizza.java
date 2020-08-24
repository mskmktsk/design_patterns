package _1_创建型模式._3_抽象工厂_Abstract_Factory.order;

import _1_创建型模式._3_抽象工厂_Abstract_Factory.factory.LDPizzaFactory;
import _1_创建型模式._3_抽象工厂_Abstract_Factory.factory.PizzaFactory;
import _1_创建型模式._3_抽象工厂_Abstract_Factory.factory.SZPizzaFactory;
import _1_创建型模式._3_抽象工厂_Abstract_Factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza() {
        PizzaFactory factory;
        Pizza pizza;
        do {
            String c = gettype("请输入披萨地区(sz/ld):").toLowerCase();
            if ("sz".equals(c)) {
                factory = new SZPizzaFactory();
            } else if ("ld".equals(c)) {
                factory = new LDPizzaFactory();
            } else {
                break;
            }
            pizza = factory.createPizza(gettype("请输入披萨口味(cheese/pepper):"));
            if (factory == null) {
                break;
            }
        } while (true);
    }

    private String gettype(String title) {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(title);
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
