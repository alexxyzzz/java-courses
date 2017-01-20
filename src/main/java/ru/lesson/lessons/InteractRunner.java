package ru.lesson.lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Класс для запуска калькулятора. Поддерживает ввод пользователя.
 */
public class InteractRunner {

    /**
     * Переменная хранит 1-е число, введёное пользователем.
     */
    private double firstArg;

    /**
     * * Переменная хранит 2-е число, введёное пользователем.
     */
    private double secondArg;

    /**
     * * Переменная хранит тип операции.
     */
    private char operator;

    /**
     * Method main.
     *
     * @param args input params
     */
    public static void main(final String[] args) {

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            InteractRunner iR = new InteractRunner();
            Calculator calc = new Calculator();
            boolean useResult = false;
            String exit = "n";

            while (!exit.equals("y")) {
                iR.userInput(reader, useResult);
                calc.doCalc(iR.firstArg, iR.secondArg, iR.operator);
                System.out.println("Result : " + calc.getResult());

                System.out.println("Do you want to use result? y/n");
                useResult = reader.readLine().equals("y");

                while (useResult) {
                    iR.userInput(reader, useResult);
                    calc.doCalc(calc.getResult(), iR.secondArg, iR.operator);
                    System.out.println("Result : " + calc.getResult());
                    System.out.println("Do you want to use result? y/n");
                    useResult = reader.readLine().equals("y");
                }
                calc.cleanResult();
                System.out.println("Exit : y/n ");
                exit = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод читает с консоли два числа и мат.оператор.
     *
     * @param reader    поток чтения данных
     * @param useResult если аргумент == false, то первое число не читаем
     * @throws IOException возможное исключение
     */
    private void userInput(final BufferedReader reader,
                           final boolean useResult) throws IOException {
        if (!useResult) {
            System.out.println("Enter first argument : ");
            this.firstArg = Double.parseDouble(reader.readLine());
        }
        System.out.println("Enter second argument : ");
        this.secondArg = Double.parseDouble(reader.readLine());

        System.out.println("Enter any of operation : + - * / ^");
        this.operator = reader.readLine().charAt(0);
    }
}
