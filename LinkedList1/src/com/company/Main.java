package com.company;

public class Main {
    public static void main(String[] args) {
       // LL list = new LL();
        // list.insertatfirst(2);
        //list.insertatfirst(21);
        //list.insertatfirst(22);
        //list.insertatfirst(24);
        //list.insertatfirst(25);
        //  list.insertatindex(3,5);
        // list.display();
        //System.out.println(list.deleteend());
        //  list.display();
        //  System.out.println(list.delete(0));
        // list.display();
        // System.out.println(list.find(22));

//        DLL list = new DLL();
//        list.insertfirst(2);
//        list.insertfirst(21);
//        list.insertfirst(22);
//        list.insertfirst(24);
//        list.insertfirst(25);
//        list.displayreverse();
//        list.insertlast(1222);
//        list.displayreverse();
//        list.insert(1222,65);
//        list.displayreverse();
//
//        list.deleteend();
//        list.displayreverse();

        CLL list = new CLL();
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        list.delete(13);
        list.display();
    }
}
