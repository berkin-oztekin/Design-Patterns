package CommandPattern.Example;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<>();

    void takeOrder(Order order){
        orderList.add(order);

    }
    void placeOrders(){
        for(Order order: orderList){
            order.Execute();
        }
        orderList.clear();
    }

}
