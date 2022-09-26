package com.priyansu;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //Setter() for model
    public void setModel(String model){
        String validateString = model.toLowerCase();
        if (validateString.equals("carrera")
                || validateString.equals("commodore")){
            this.model = model;
        }
        else{
            this.model = "Unknown";
        }
    }
    //Getter()
    public String getModel(){
        return this.model;
    }
}
