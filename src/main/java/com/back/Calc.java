package com.back;

public class Calc {
    public static int run(String exp) {
        String[] bits = exp.split(" ");

        int num1 = Integer.parseInt(bits[0]);
        String op = bits[1];
        int num2 = Integer.parseInt(bits[2]);

        int result = 0;
        if (op.equals("+")) {
            result = num1 + num2;
        } else if (op.equals("-")) {
            result = num1 - num2;
        }

        if (bits.length == 3) {
            return result;
        }

        String op2 = bits[3];
        int num3 = Integer.parseInt(bits[4]);

        if (op2.equals("+")) {
            result = result + num3;
        } else if (op2.equals("-")) {
            result = result - num3;
        }

        return result;



    }
}
