package ru.lesson.lessons;

/**
 * Класс реализует калькулятор
 */
public class Calculator {
    /**
     * результат вычисления
     */
    private int result;

    /**
     * суммируем аргументы.
     * params - Аргументы суммирования.
     */
    public void add(int... params) {
        for (Integer i : params) {
            this.result += i;
        }
    }

    /**
     * Получить результат вычисления
     */
    public int getResult() {
        return this.result;
    }

    /**
     * Очистить результат вычисления
     */
    public void cleanResult() {
        this.result = 0;
    }
}