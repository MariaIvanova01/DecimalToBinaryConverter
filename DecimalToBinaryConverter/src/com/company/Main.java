package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = Integer.valueOf(scan.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (decimal != 0){
            stack.push(decimal % 2);
            decimal /= 2;

        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
