package com.priyansu;

public class Main {
    public static void main(String[] args) {
        // create new object of class Car.
        Car porsche = new Car();
        Car holden = new Car();
        /**
         * "InputString" -> parameter String(model)  in getter() for model
         */
        porsche.setModel("holdn");
        /**
         * It prints by accessing getModel() through object porsche
         */
        System.out.println("Model is " + porsche.getModel());
    }
}