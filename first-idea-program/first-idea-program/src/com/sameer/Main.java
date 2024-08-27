package com.sameer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(2);
        System.out.print("I am sameer ");
        System.out.println("goyal");
        System.out.print("Enter a number:");
        Scanner input = new Scanner(System.in);
        System.out.println("Your integer is:"+input.nextInt());
        System.out.print("Enter Your name:");
        Scanner name = new Scanner(System.in);
        System.out.println("Your Name is: "+name.next());
        System.out.print("Enter Your Line:");
        Scanner line = new Scanner(System.in);
        System.out.println("Your Line is: "+line.nextLine());
    }
}