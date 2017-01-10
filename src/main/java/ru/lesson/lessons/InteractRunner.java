package ru.lesson.lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Класс для запуска калькулятора. Поддерживает ввод пользователя.
 */
public class InteractRunner {
    private double firstArg;
    private double secondArg;
    private char operator;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Calculator calc = new Calculator();
            InteractRunner iR = new InteractRunner();
            String exit = "n";
            while (!exit.equals("y")) {
                // Вводим пользовательские данные
                iR.userInput(reader);
                // Вызываем операцию
                calc.callOperation(iR.firstArg, iR.secondArg, iR.operator);
                // Выводим результат
                System.out.println("Result : " + calc.getResult());
                // Спрашиваем, использовтаь результат или нет
                System.out.println("Do you want to use result? y/n");
                String yesOrNo = reader.readLine();
                // До тех пор, пока юзер не введёт "n", используем вместо первого аргумента переменную result.
                while (yesOrNo.equals("y")) {
                    iR.userHalfInput(reader);
                    calc.callOperation(calc.getResult(), iR.secondArg, iR.operator);
                    System.out.println("Result : " + calc.getResult());
                    System.out.println("Do you want to use result? y/n");
                    yesOrNo = reader.readLine();
                }
                // Выходить или нет
                System.out.println("Exit : y/n ");
                exit = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error data input : " + e.toString());
            e.printStackTrace();
        }
    }

    /**
     * Чиаем с консоли два аргумента и мат.оператор
     */
    private void userInput(BufferedReader reader) throws IOException {
        System.out.println("Enter first argument : ");
        this.firstArg = Double.parseDouble(reader.readLine());
        this.userHalfInput(reader);
    }

    /**
     * Читем с консоли только второй аргумент и оператор
     */
    private void userHalfInput(BufferedReader reader) throws IOException {
        System.out.println("Enter second argument : ");
        this.secondArg = Double.parseDouble(reader.readLine());
        System.out.println("Enter any of operation : + - * / ^");
        this.operator = reader.readLine().charAt(0);
    }
}

