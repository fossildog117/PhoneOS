package com.company;

/**
 * Created by nathanliu on 20/02/2016.
 */
public class Contact {

    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
