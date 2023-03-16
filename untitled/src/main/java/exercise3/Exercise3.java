package exercise3;

//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        checkNumberInArray();
    }

    private static void checkNumberInArray() {
        int[] array = creatArray();

        for (int value : array) {
            if (value % 3 == 0) {
                System.out.println("Число " + value + "делится на 3");
            }
        }
    }
private static int[] creatArray() {
    int sizeArray = 0;

    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Введите размер массива, он будет заполнен случайными числами.");
        sizeArray = sc.nextInt();
    } catch (InputMismatchException e) {
        System.err.println("Введите число");
    }
    Random random = new Random();
    int[] arrey = new int[sizeArray];

    for (int i = 0; i < sizeArray; i++) {
        arrey[i] = random.nextInt(110);
    }
    System.out.println("Созданный массив: " + Arrays.toString(arrey));
    return arrey;
    }
}

