package com.sameer;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println("The number is " + num);


//        Type casting
        int num2 = (int)(45.4f);
        System.out.println("The number is " + num2);


//        automatic type promotion in expressions
        int a = 257;
        byte v = (byte)(a);
        System.out.println("The number is " + v);
    }
}
