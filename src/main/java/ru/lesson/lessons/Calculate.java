package ru.lesson.lessons;

/**
 * Class emulate calculator.
 */
public final class Calculate {

    /**
     * Default constructor.
     */
    private Calculate() {
    }

    /**
     * Method main.
     * @param args input parameters
     */
    public static void main(final String[] args) {

        System.out.println("Calculate!"); // add comment !
        double first = Double.parseDouble(args[0]);
        double second = Double.parseDouble(args[1]);
        char operator = args[2].charAt(0);

        System.out.println(operation(first, second, operator));
    }

    /**
     * Method defined mathematical operation.
     *
     * @param d1  first number
     * @param d2  second number
     * @param ch1 mathematical operator
     * @return result
     */
    static double operation(final double d1, final double d2, final char ch1) {
        if (ch1 == '+') {
            return d1 + d2;
        }
        if (ch1 == '-') {
            return d1 - d2;
        }
        if (ch1 == '*') {
            return d1 * d2;
        }
        if (ch1 == '/') {
            return d1 / d2;
        }
        if (ch1 == '^') {
            return Math.pow(d1, d2);
        } else {
            System.out.println("Wrong operator.");
        }
        return -1;
    }
}
