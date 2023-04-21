/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Order;

import Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class OrderDirectory {
    private ArrayList<Order> orderList;
    
    public OrderDirectory(){
        this.orderList = new ArrayList<>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Order createOrder(Hospital hospital){
        Order order = new Order();
        order.setHospital(hospital);
        orderList.add(order);
        return order;
    }
}