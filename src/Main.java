import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of array elements: " + sum);

        int[] array1 = {4, 3, 2, 5, 67, 11};

        int max1 = array1[0];
        int max2 = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > max1) {
                max2 = max1;
                max1 = array1[i];
            } else if (array1[i] > max2) {
                max2 = array1[i];
            }
        }
        System.out.println("Друге максимальне число: " + max2);

        int min1 = array1[0];
        int min2 = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] < min1) {
                min2 = min1;
                min1 = array1[i];
            } else if (array1[i] < min2) {
                min2 = array1[i];
            }
        }
        System.out.println("Друге мінімальне число: " + min2);

        Random random = new Random();

        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Найбільше число: " + max);
    }
}