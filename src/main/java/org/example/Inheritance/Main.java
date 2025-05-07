package org.example.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", "Turkey");
        car.getInfo();
        Bike bike = new Bike("Hiper", "Gilit", Type.CITY);
        bike.getInfo();
    }
}
