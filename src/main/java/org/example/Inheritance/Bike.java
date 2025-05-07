package org.example.Inheritance;

public class Bike extends Vehicle {
    private Type type;

    public Bike(String brand, String model, Type type) {
        super(brand, model);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void getInfo() {
        System.out.println("Bike: Brand: " + getBrand() + "| Model: " + getModel() + "| Type: " + getType());
    }
}
