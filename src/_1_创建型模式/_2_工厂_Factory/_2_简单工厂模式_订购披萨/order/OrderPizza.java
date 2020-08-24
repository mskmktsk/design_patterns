package _1_创建型模式._2_工厂_Factory._2_简单工厂模式_订购披萨.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza() {
        String orderType;
        do {
            orderType = gettype();
        } while (PizzaFactory.createPizza(orderType) != null);
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
