package org.example.inheritance;

public class Car extends Vehicle {
    private String assemblyСountry;

    public Car(String brand, String model, String assemblyСountry) {
        super(brand, model);
        this.assemblyСountry = assemblyСountry;
    }

    public String getAssemblyСountry() {
        return assemblyСountry;
    }

    public void setAssemblyСountry(String assemblyСountry) {
        this.assemblyСountry = assemblyСountry;
    }

    @Override
    public void getInfo() {
        System.out.println("Car: Brand: " + getBrand() + "| Model: " + getModel() + "| Assembly country: " + getAssemblyСountry());
    }
}
