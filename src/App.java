import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.print("Здравствуйте, введите текст: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        ActionsMenu menu = new ActionsMenu();
        menu.menu();


        System.out.println("Что желаете сделать?");
        int switcher = sc.nextInt();

        System.out.println();

        switch (switcher) {
            case 1:
                System.out.println("Длина вашего текста: " + text.length());
            break;

            case 2:
                System.out.println(text.toUpperCase());
            break;
        }



    }
}