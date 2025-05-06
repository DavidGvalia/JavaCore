package org.example;

import java.util.Arrays;
import java.util.Random;

public class Massive {
    public static final int SIZE = 8;
    public static void main(String[] args) {
        /*Напишите метод, который принимает два массива целых чисел одинаковой длины и возвращает новый массив,
        где каждый элемент равен сумме соответствующих элементов входных массивов.*/
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{4, 5, 6};
        System.out.println("Сумма двух массивов");
        System.out.println(Arrays.toString(massiveSum(array1, array2)));

        /*Дано: двумерная матрица 8 на 8 из случайных чисел от 0 до 255 (спектр цветов GrayScale). Напишите алгоритм
        "поворота" такой матрицы на 90 градусов по часовой стрелке.*/
        int[][] array3 = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                array3[i][j] = random.nextInt(255);
            }
        }
        System.out.println("Матрица");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", array3[i][j]);
            }
            System.out.println();
        }
        int[][] array4 = turn90(array3);
        System.out.println("Матрица, перевернутая на 90 градусов");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", array4[i][j]);
            }
            System.out.println();
        }

    }
    public static int[] massiveSum(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] + array2[i];
        }
        return array1;
    }
    public static int[][] turn90(int[][] array) {
        for (int i = 0; i < SIZE / 2; i++) {
            for (int j = i; j < SIZE - i - 1; j++) {
                // Сохраняем верхний элемент
                int temp = array[i][j];

                // Перемещение элементов по часовой стрелке
                array[i][j] = array[SIZE - j - 1][i]; // Левый элемент становится верхним
                array[SIZE - j - 1][i] = array[SIZE - i - 1][SIZE - j - 1]; // Нижний элемент становится левым
                array[SIZE - i - 1][SIZE - j - 1] = array[j][SIZE - i - 1]; // Правый элемент становится нижним
                array[j][SIZE - i - 1] = temp; // Верхний элемент становится правым
            }
        }
        return array;
    }
}
