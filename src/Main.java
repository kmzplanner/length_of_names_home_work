import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maxName = null;

        while (true) {
            System.out.println("Введите имя с большой буквы: ");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершина");
                break;
            } else {
                String name = input;
                if (Character.isUpperCase(name.charAt(0))) {
                    if (maxName == null) {
                        System.out.println("Это первое введеное имя");
                        maxName = input;
                    } else {
                        if (name.length() > maxName.length()) {
                            System.out.println("Самое длинное имя: " + name);
                            maxName = name;
                        } else {
                            System.out.println("Самое длинное имя: " + maxName + "\n" +
                                    "Нехватает символов: " + (maxName.length() - name.length()));
                        }
                    }
                } else {
                    System.out.println("Имена нужно вводить с большой буквы!");
                }
            }
        }
    }
}
