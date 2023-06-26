// Простая задача 2: Обработка некорректного ввода

// Напишите программу, которая запрашивает у пользователя его возраст. 
// Если введенное значение не является числом, выбросите исключение NumberFormatException с сообщением "Некорректный ввод". 
// Иначе выведите возраст на экран.

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String age = sc.nextLine();

        sc.close();

        try {
            ageCheck(age);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect age! " + e.getMessage());
        }
    }

    public static void ageCheck(String age) throws NumberFormatException {
        int num = Integer.parseInt(age);
        if (num == 0) {
            throw new NumberFormatException();
        }
        System.out.println(age);
    }
}
