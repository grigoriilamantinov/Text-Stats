import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        System.out.println("Здравствуйте");
        System.out.print("Введите текст: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Длина вашего текста: " + text.length());
    }
}
