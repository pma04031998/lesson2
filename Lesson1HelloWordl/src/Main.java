public class Main {
    public static void main(String[] args) {
        //переменная для хранения валюты: рубли
        int walletRU = 3000;

        //переменная для хранения валюты: доллары
        int walletDollar = 94;

        boolean lie = false;
        boolean truth = true;

        //Информация о валюте для вывода в консоль
        String str = " рублей, в долларах это - ";

        //Переменная, хранящая результат преобразования
        int result = walletRU/walletDollar;
        //Вводим в консоль полученный результат
        System.out.println(walletRU + str + result);

        /*
        *Арифметические операции:
        * сложение: +
        * вычетание: -
        * умножение: *
        * деление: /
        * остаток от деления: %
         */
        //Создание переменной
        //тип данных    имя
        //String someString
        //int someNumber
        sum(10,25);
        subtraction(7,20);
        multiplication(20,5);
        division(25,5);
    }

    public static void sum (int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Результат сложения двух чисел равен - " + result);
    }

    public static void subtraction (int num1, int num2) {
        int result = num2 - num1;
        System.out.println("Результат вычетания двух чисел равен - " + result);
    }

    public static void multiplication (int num1, int num2){
        int result = num1 * num2;
        System.out.println("Результат умножения двух чисел равен - " + result);
    }

    public static void division (int num1, int num2){
        int result = num1 / num2;
        System.out.println("Результат деления двух чисел равен - " + result);
    }
}