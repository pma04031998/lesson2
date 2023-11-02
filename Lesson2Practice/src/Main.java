import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Задание 1
        System.out.println("Fall seven times");
        System.out.println("and");
        System.out.println("stand up eight");

        //Задание 2
        System.out.println("Введите первое число: ");
        int firstInfo = scanner.nextInt();
        System.out.println(firstInfo);
        System.out.println("Введите второе число: ");
        int secondInfo = scanner.nextInt();
        System.out.println(secondInfo);
        int result = firstInfo + secondInfo;
        System.out.println("Сумма чисел: " + result);
        result = firstInfo - secondInfo;
        System.out.println("Разница чисел: " + result);
        result = firstInfo * secondInfo;
        System.out.println("Произведение чисел: " + result);
        result = firstInfo / secondInfo;
        System.out.println("Деление чисел: " + result);

        //Задание 3
        String str = "4512";
        StringBuilder sbAss = new StringBuilder(str);
        sbAss.reverse();
        System.out.println(sbAss);

        //Задание 4
        System.out.println("Введите количество часов");
        int info = scanner.nextInt();
        if (0 < info && info < 6) {
            System.out.println("Good Night");
        }
        else if (6 < info && info < 13) {
            System.out.println("Good Morning");
        }
        else if (13 < info && info < 17) {
            System.out.println("Good Day");
        }
        else if (17 < info && info > 0) {
            System.out.println("Good Evening");
        }

        //Задание 5
        System.out.println("Введите целое шестизначное число");
        int number1 = scanner.nextInt();
        String text=String.join(",", String.valueOf(number1).split(""));
        System.out.println(text);
    }
}
