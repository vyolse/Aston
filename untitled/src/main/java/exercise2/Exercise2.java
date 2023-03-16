package exercise2;
//Составить алгоритм: если введенное имя совпадает с Вячеслав,то вывести “Привет, Вячеслав”,
//если нет, то вывести "Нет такого имени"

import java.util.Scanner;

public class Exercise2 {
    public static final String NAME = "Вячеслав";

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Введите имя:");
            checName(scn.nextLine());
        }
    }


    private static void checName(String inputName) {
        if (NAME.equals(inputName)) {
            System.out.println("Привет, " + NAME);
        } else {
            System.out.println("Некорректное имя");
        }
    }
}



