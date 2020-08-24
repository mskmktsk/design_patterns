package _1_创建型模式._2_工厂_Factory._1_传统实现_披萨订购.order;

import _1_创建型模式._2_工厂_Factory._1_传统实现_披萨订购.pizza.CheesePizza;
import _1_创建型模式._2_工厂_Factory._1_传统实现_披萨订购.pizza.GreekPizza;
import _1_创建型模式._2_工厂_Factory._1_传统实现_披萨订购.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType = null;
        do {
            orderType = gettype();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨 ");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨 ");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
