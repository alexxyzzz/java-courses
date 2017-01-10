package ru.lesson.lessons;

/**
 * Класс реализует калькулятор
 */
public class Calculator {
    /**
     * Результат вычисления
     */
    private double result;

    /**
     * Суммируем аргументы
     */
    private void addition(double d1, double d2) {
        this.result = d1 + d2;
    }

    /**
     * Вычитаем из первого аргумента второй.
     */
    private void deduction(double d1, double d2) {
        this.result = d1 - d2;
    }

    /**
     * Умножаем аргументы
     */
    private void multiplication(double d1, double d2) {
        this.result = d1 * d2;
    }

    /**
     * Делим первый аргумент на второй
     */
    private void division(double d1, double d2) {
        this.result = d1 / d2;
    }

    /**
     * Возведение в степень
     */
    private void power(double d1, double d2) {
        this.result = Math.pow(d1, d2);
    }

    /**
     * Получить результат вычисления
     */
    double getResult() {
        return this.result;
    }

    /**
     * Очистить результат вычисления
     */
    public void cleanResult() {
        this.result = 0;
    }

    /**
     * Выбираем, какую операцию вызвать
     */
    void callOperation(double number1, double number2, char operator1) {
        switch (operator1) {
            case '+':
                this.addition(number1, number2);
                break;
            case '-':
                this.deduction(number1, number2);
                break;
            case '*':
                this.multiplication(number1, number2);
                break;
            case '/':
                this.division(number1, number2);
                break;
            case '^':
                this.power(number1, number2);
        }
    }
}