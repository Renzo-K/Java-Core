package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        //region Задание 2. Создание переменных со всеми примитивными типами данных.
        boolean h = true;
        byte a = 127;
        short b = 32767;
        int c = 123456789;
        long d = 20000000000L;
        float e = 7.17f;
        double f = 7.177;
        char g = '\u2242';
        //endregion

        //region Вызовы методов заданий 3 - 8.

        // Задание 3
        System.out.println(task3(5, 5, 5, 5));
        task4 (5, 3);
        task5 (-5);
        // Задание 6
        System.out.println(task6(-1));
        task7("Jeka");
        task8(99);
        //endregion

    }




//region task3
    public static float task3(float a, float b, float c, float d) {

        return a * (b + (c / d));

    }
//endregion

//region task4
    public static void task4 (int a, int b) {
        boolean bool = true;
        if ((a + b) >= 10 && (a + b) <= 20) {
            System.out.println(bool);
        } else {
            System.out.println(!bool);
        }
    }
//endregion

//region task5
    public static void task5 (int a) {
        if (a >= 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
    }
//endregion
    
//region task6
    public static boolean task6 (int a) {
        if (a < 0) {
            return false;
        } else return true;
    }
//endregion

//region task7
    public static void task7(String name) {
        System.out.println("Hello, " + name + "!");
    }
//endregion

//region task8
    public static void task8(int y) {
        if (y % 4 == 0) {
            System.out.println("Leap Year");
        } else if (y % 400 == 0) {
            System.out.println("Leap Year");
        } else if (y % 100 == 0) {
            System.out.println("Usual Year");
        } else {
            System.out.println("Usual Year");
        }
    }
//endregion
}