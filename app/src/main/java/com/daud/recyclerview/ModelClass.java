package com.daud.recyclerview;

public class ModelClass {
    private String Name,Amount;

    public ModelClass(String name, String amount) {
        Name = name;
        Amount = amount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }
}
