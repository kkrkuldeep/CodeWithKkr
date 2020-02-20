package com.mountBlue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("hello World!");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();

        if (num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
