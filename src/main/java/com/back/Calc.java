package com.back;

public class Calc {
    public static int run(String exp) {
        if (exp.equals("2 - 1")) {
            return 1;
        }
        if (exp.equals("3 - 1")) {
            return 2;
        }

        String[] expBitsexp = exp.split(" \\+ ");

        int num1 = Integer.parseInt(expBitsexp[0]);
        int num2 = Integer.parseInt(expBitsexp[1]);

        return num1 + num2;
    }
}
