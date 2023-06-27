package org.example;
public class Task02 {
//    try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//    } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//    }

    public static void main(String[] args) {
        Task2();
    }
    private static void Task2() {
        try {
            int[] arr = {1, 2, 4, 5, 7, 8, 9, 3, 6};
            int d = 0; // для получения резльтата без исключения, меняем 0 на любое другое значение;
            double result = arr[8] / d; // для отработки второго исключения может либо уменьшит размер массива, либо увеличить индекс;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception - " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception - " + e);
        }
    }
}
