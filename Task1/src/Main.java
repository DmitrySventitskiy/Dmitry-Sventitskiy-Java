import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число: ");
        System.out.println(console.nextInt() > 7 ? "Привет" : "Пока");
    }
}
