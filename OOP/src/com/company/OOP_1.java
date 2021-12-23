package com.company;

public class OOP_1 {
    public static void main(String[] args) {
        // OOP LECTURE 01
        // classes , objects , constructor
        Student[] students = new Student[5];
        Student kunal = new Student();
//        System.out.println(kunal.marks);
//        kunal.greeting();
        Student random = new Student(kunal);
        System.out.println(random.name);
        Student rand = new Student(34,"Shubham",34.34f);
//        rand.changename("Gunjan");
        System.out.println(rand.name);

        Student one = new Student();
        Student two = one;
        one.name = "Deepa Agarwal";
        System.out.println(two.name);

    }
    //create a class for every single student
    static class Student{
        int rno;
        String name;
        float marks;

        // change the name if you need
        void changename(String name){
            this.name = name;
        }
        //just checking the name or this.name by using greeting function
        void greeting(){
            System.out.println("Hello! My name is " + this.name);
        }

        //call other function within a function
        Student (Student other){
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        //call the function/ class if no arguments are passed
        Student(){
            this.rno = 12;
            this.name = "agarwal";
            this.marks = 45.34f;
        }

        //call the function/ class if arguments are passed
        //Student arpit = new Student(12,"arpit sharma",45.34f);
        //Here, this will be replaced with arpit
        Student(int roll, String naam, float m){
            rno = roll;
            name = naam;
            marks = m;
        }
    }
}
