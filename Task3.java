// Сложная задача: Чтение файла и подсчет суммы чисел

// Напишите программу, которая считывает содержимое текстового файла, в котором каждая строка содержит одно число. 
// Программа должна подсчитать сумму всех чисел в файле. 
// Если встретится строка, которая не может быть преобразована в число, 
// выбросите исключение NumberFormatException с сообщением "Некорректное значение числа в файле".

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String str;
            int sum = 0;
            while ((str = br.readLine()) != null) {
                sum += Integer.parseInt(str);
            }
            System.out.println("Sum of numbers in file = " + sum);
            br.close();
        } catch (NumberFormatException e) {
            System.out.println("Incorrect number value");
        } catch (IOException e) {
            System.out.println("Another error");
        }

    }
}
