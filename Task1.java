// Простая задача 1: Проверка деления на ноль
// Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление. 
// Если второе число равно нулю, выбросите исключение ArithmeticException с сообщением "Деление на ноль недопустимо". 
// Иначе выведите результат деления на экран.

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        sc.close();

        division(num1, num2);
    }

    public static void division(int a, int b) {
        try {
            System.out.println(a + " / " + b + " = " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is prohibited");
        }
    }
}