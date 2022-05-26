package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int c = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (a != 4) {
//            throw new Error("berilgen 2 kv emes");
//        }
//        if (c!= 9) {
//            throw new Error("berilgen 3 kv emes");
//        }
//        if (b!= 16) {
//            throw new Error("berilgen 4 kv emes");
//        }
////
//       try {int e =5;
//           int r=0;
//           System.out.println(e/r);
//
//       }catch (ArithmeticException itIsObject ){
//           System.out.println("o bolso bolboit");
//
//       }finally {
//           System.out.println("sdfh");
//
//       }
        try {
            Car.Drive();


        } catch (Exception e) {
            Car.Close();
        }
    }
}