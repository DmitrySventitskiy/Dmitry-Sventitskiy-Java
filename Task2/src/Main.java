import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя: ");
        System.out.println("Вячеслав".equals(console.next()) ? "Привет, Вячеслав" : "Нет такого имени");
    }
}