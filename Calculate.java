public class Calculate {

    public static void main(String[] args) {

        System.out.println("Calculate!"); // add comment !
        double first = Double.parseDouble(args[0]);
        double second = Double.parseDouble(args[1]);
        char operator = args[2].charAt(0);

        System.out.println(operation(first, second, operator));
    }

    public static double operation(double d1, double d2, char ch1) {
        if (ch1 == '+') return d1+d2;
        if (ch1 == '-') return d1-d2;
        if (ch1 == '*') return d1*d2;
        if (ch1 == '/') return d1/d2;
        if (ch1 == '^') return Math.pow(d1,d2);
        else System.out.println("Wrong operator.");
        return -1;
    }
}
