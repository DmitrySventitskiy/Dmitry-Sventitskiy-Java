import java.util.Scanner;

public class Main {
    private static Scanner console = new Scanner(System.in);
    private static int size = 0;

    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        size = console.nextInt();
        int[] arr = inputArr();
        printArr(arr);
        printMultiples(arr, 3);
    }

    private static int[] inputArr(){
        int[] arr = new int[size];
        for (int i =0; i < arr.length; i++){
            System.out.print("Введите " + (i+1) + " элемент массива: ");
            arr[i] = console.nextInt();
        }
        return arr;
    }

    private static void printMultiples(int[] arr, int multiple){
        System.out.println();
        System.out.print("Числа кратные " + multiple + ": ");
        for(int i : arr) {
            if (i % multiple == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    private static void printArr(int[] arr) {
        System.out.print("Массив: ");
        for(int i : arr) {
            System.out.print(i + ", ");
        }
    }
}