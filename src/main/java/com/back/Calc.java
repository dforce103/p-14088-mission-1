package com.back;

public class Calc {
    public static int run(String exp) {
        String[] bits = exp.split(" ");

        int num1 = Integer.parseInt(bits[0]);
        String op = bits[1];
        int num2 = Integer.parseInt(bits[2]);

        if (op.equals("-")) {
            return num1 - num2;
        }
        return num1 + num2;

    }
}
