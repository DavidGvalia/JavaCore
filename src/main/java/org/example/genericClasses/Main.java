package org.example.genericClasses;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new Pair<>(1, 2);
        System.out.println("Первое значение: " + pair.getFirst());
        System.out.println("Второе значение: " + pair.getSecond());
        pair.swap();
        System.out.println("Первое значение: " + pair.getFirst());
        System.out.println("Второе значение: " + pair.getSecond());
    }
}
