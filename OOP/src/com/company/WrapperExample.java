package com.company;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // wrapper class
        Integer  num = 32;
        swap(a,b);
        System.out.println(a+" "+b);

//        final int bonus = 2;
//        bonus= 3;
       final A kunal = new A("Something new");
       kunal.name = "Kunal khushwaha";
       // when a non primitive is final, you cannot reassign it.
//       kunal = new A("hello india");
        System.out.println(kunal.name);

        // remove the garbage in the heap meomory by using garbage collector
        A obj;
        for(int i =0; i<1000;i++){
            obj = new A("Random name");
        }
    }

    static void swap(int a, int b){
        int temp = a;
        a=b;
        b= temp;
    }
}
    class A{
    final int num = 10 ;
    String name;

     public A(String nam){
//         System.out.println("object created");
         this.name = nam;

     }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("object is destroyed");
        }
    }
