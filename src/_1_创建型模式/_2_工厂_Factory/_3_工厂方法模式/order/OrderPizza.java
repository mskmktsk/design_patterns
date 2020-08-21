package _1_创建型模式._2_工厂_Factory._3_工厂方法模式.order;

import _1_创建型模式._2_工厂_Factory._3_工厂方法模式.factory.PizzaFactory;
import _1_创建型模式._2_工厂_Factory._3_工厂方法模式.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza() {
        PizzaFactory factory;
        Pizza pizza;
        do {
            factory = PizzaFactory.getFactory(gettype("请输入披萨地区(sz/ld):"));
            if (factory == null) {
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
