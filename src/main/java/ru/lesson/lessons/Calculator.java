package ru.lesson.lessons;

/**
 * Класс для вычисления арифмитических операций.
 */
class Calculator {

    /**
     * Результат вычисления.
     */
    private double result;

    /**
     * Метод возвращает результат вычисления.
     *
     * @return результат
     */
    double getResult() {
        return this.result;
    }

    /**
     * Очистить результат вычисления.
     */
    void cleanResult() {
        this.result = 0;
    }

    /**
     * Метод для вызова арифметических операций.
     *
     * @param num1     первое число
     * @param num2     второе число
     * @param operator арифмитическая операция
     */
    void doCalc(final double num1, final double num2, final char operator) {
        switch (operator) {
            case '+':
                this.addition(num1, num2);
                break;
            case '-':
                this.deduction(num1, num2);
                break;
            case '*':
                this.multiplication(num1, num2);
                break;
            case '/':
                this.division(num1, num2);
                break;
            case '^':
                this.power(num1, num2);
                break;
            default:
                System.out.println("Input Error");
        }
    }

    /**
     * Сложение чисел.
     *
     * @param number1 первое число
     * @param number2 второе число
     */
    private void addition(final double number1, final double number2) {
        this.result = number1 + number2;
    }

    /**
     * Вычитание чисел.
     *
     * @param number1 первое число
     * @param number2 втророе число
     */
    private void deduction(final double number1, final double number2) {
        this.result = number1 - number2;
    }

    /**
     * Умножение чисел.
     *
     * @param number1 первое число
     * @param number2 второе число
     */
    private void multiplication(final double number1, final double number2) {
        this.result = number1 * number2;
    }

    /**
     * Деление чисел.
     *
     * @param number1 первое число
     * @param number2 второе число
     */
    private void division(final double number1, final double number2) {
        this.result = number1 / number2;
    }

    /**
     * Возведение в степень.
     *
     * @param number1 первое число
     * @param number2 второе число
     */
    private void power(final double number1, final double number2) {
        this.result = Math.pow(number1, number2);
    }
}
