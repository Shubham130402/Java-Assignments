package com.company;

public class Main{
    public static void main(String[] args) {
        // write a program which will print hello world
        message();

    }
    static void message(){
        System.out.println("Hello world");
        message1();
}
  static void message1() {
      System.out.println("Hello world");
      message2();
  }
    static void message2() {
        System.out.println("Hello world");
        message3();
    }

    static void message3() {
        System.out.println("Hello world");
        message4();
    }

    static void message4() {
        System.out.println("Hello world");
        message5();
    }
    static void message5() {
        System.out.println("Hello world");
    }
}