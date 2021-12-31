package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String, Car > people = new HashMap<>();
        people.put("a", new Car(123124, 183));
        people.put("b", new Car(224344, 192));
        people.put("c", new Car(356823, 205));
        people.put("d", new Car(423455, 212));
        System.out.println(people.get("a"));
        System.out.println(people.get("b"));
        System.out.println(people.get("c"));
        System.out.println(people.get("d"));

        HashMap<Integer, Information> mashina = new HashMap <>();
        mashina.put(1,new Information(2011,"mersedes",10000,"white"));
        mashina.put(2,new Information(2013,"mersedes",12000,"grey"));
        mashina.put(3,new Information(2014,"mersedes",13000,"black"));
        mashina.put(4,new Information(2016,"mersedes",20000,"blu"));

        System.out.println(mashina.entrySet());

    }
}
