package com.wegotrip;

public class HelloWorld {
    public static void main(String[] args) {
        //boolean flag = true;
        //byte aByte; // 8 бит
        //short aShort; // 16 бит
        //must have
        //int aInt; // 32 бит
        //long aLong; //64 бит
        // float aFloat;
        //must have
        // double aDouble = 1.5;
        // char aChar = '0'
        // Операторы математические + - * / %
        // Операторы условные > < >= <= == != !

        //Арифметические операторы
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (b--));
        // Проверка разницы в d++ и ++d
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));

        //Условные операторы
        int exampleOne = 10;
        int exampleTwo = 2;
        if (exampleOne > exampleTwo) {
            System.out.println("Первая переменная больше второй");
        } else if(exampleOne < exampleTwo) {
            System.out.println("Первая переменная меньше второй");
        } else {
            System.out.println("Переменные равны");
        }

        //Логические операторы
        if(exampleOne >exampleTwo && exampleOne>0) {
            System.out.println("Первая переменная больше второй и является положительным числом");
        } else if (exampleOne<0 || exampleOne<exampleTwo) {
            System.out.println("Первая переменная меньше второй или является отрицательным числом");
        }

        //Переполнение при вычислениях
        int exampleThree = Integer.MAX_VALUE;
        System.out.println("Максимальное значение переменной типа int: " + exampleThree);
        int exampleFour = exampleThree * exampleOne;
        System.out.println("Отображение при переполнении: " + exampleFour);

        //Комбинаций типов данных (int и double)
        double exampleFive = 10.5;
        System.out.println(exampleTwo+exampleFive);
    }
}
