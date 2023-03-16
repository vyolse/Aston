package exercise1;

import java.util.NoSuchElementException;
import java.util.Scanner;

//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

public class Exercise1 {
    public static void main(String[] aggs) {hello();}
    public static void hello() {
        try (Scanner cs = new Scanner(System.in)){
            System.out.println("Введите число: ");
            if (cs.nextInt() > 7) {
                System.out.println("Привет");
            } else {
                    System.out.println("Введенное число меньше, либо равно 7");
                }
        } catch (NoSuchElementException e) {
            System.err.println("Некорректные данные");
        }
    }

}

