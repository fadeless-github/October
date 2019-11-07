package com.apple.list;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Manager {
    public static void main(String[] args){
        Customer customer1 = new Customer("James","123456");
        Customer customer2 = new Customer("Tony","122488");

        List list = new ArrayList();
        list.add(customer1);
        list.add(customer2);


        Map<String,Customer> map = new HashMap<>();
        map.put("001",customer1);
        map.put("002",customer2);

        map.get("002");

        Map<String,String> map1 = new HashMap<>();
        map1.put("003","thi is me");

        System.out.println(list.get(0).toString());
        System.out.println(map.get("002").toString());
    }
}
