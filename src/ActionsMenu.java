public class ActionsMenu {

    public static void menu(){
        System.out.println();
        System.out.println("Цифрой можно выбрать действие:");
        System.out.println("1 - посчитать количество всех знаков.");
        System.out.println("2 - сделать все буквы большими.");
        System.out.println("3 - узнать сколько цифр и букв в тексте");
        System.out.println();


    }

    void digitCount(String text) {
        char[] array = text.toCharArray();
        int digit = 0;
        int letter = 0;
        for ( char element : array ) {
            if (Character.isDigit(element)) {
                digit++;
            }
            if (Character.isAlphabetic(element)) {
                letter++;
            }
        }
        System.out.println("В тексте было цифр: " + digit + ". А буквы было: " + letter);


    }
}

