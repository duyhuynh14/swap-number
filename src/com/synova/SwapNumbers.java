package com.synova;

public class SwapNumbers {
    public static void main(String[] args) {

        int x = 100;
        int y = 200;

        System.out.println("--Before swap--");
        System.out.println("First number = " + x);
        System.out.println("Second number = " + y);
        //Swapping in steps
        x = x + y;
        y = x - y;
        x = x - y;

        //Verify swapped valuesS
        System.out.println("--After swap--");
        System.out.println("First number = " + x);
        System.out.println("Second number = " + y);
    }
}
