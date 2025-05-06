package org.example.internal_nested;

public class Internal_nested_classes {
    public static void main(String[] args) {
        Car car = new Car("Toyota Corolla", new Car.Engine(TypeOfEngine.PETROL, 121));
        car.getInfo();
    }

}
