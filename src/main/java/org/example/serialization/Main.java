package org.example.serialization;

import java.io.*;

public class Main{
    public static void main(String[] args) {
        Person person_1 = new Person("David", 10, "david@gmail.com");
        Person person_2 = new Person("Jack", 20, "jack@gmail.com");
        //Сериализация объекта
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/davidgvaliya/Desktop/1.txt"))) {
            oos.writeObject(person_1);
            oos.writeObject(person_2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Десериализация объекта
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/davidgvaliya/Desktop/1.txt"))){
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);
        } catch (IOException|ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
