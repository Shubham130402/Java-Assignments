package com.company;
import java.util.*;
// second progrem for n nodes
public class LinkedList{
//Representing the node of a singly linkeclist
static class Node{
int data;
Node next;
Node ( int data){
    this.data = data;
    this.next = null;

}// constructor of the node
}
// Representing the head and tail of the linkedlist
public Node head =null;
public Node tail = null;

//addNOde() will add a new node
    public void addNode (int data){
        Node newnode = new Node (data);

        //check if the list is empty or not
        if(head==null){
            head = newnode;
            tail = newnode;

        }else {
            // newnode will be added after tail such that next will point to newNOde
            tail.next= newnode;
            tail= newnode;
        }
    }
    //countNOde() will count the nodes present in the list
public int countNOde(){
        int count =0 ;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;

        }
        return count;
}

// display() will display the list
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println(" list is empty");
            return;
        }
        System.out.println(" Nodes of  Singly ");
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;

        }
        System.out.println();
    }



    public static void main(String[] args){
        LinkedList slist = new LinkedList();

        //add nodes to the list
        slist.addNode(1);
        slist.addNode(2);
        slist.addNode(3);
        slist.addNode(4);
        slist.addNode(5);

        slist.display();
        System.out.println("Counts is :" + slist.countNOde());
    }
}
/* Creating first program for the linkedlist by taking 3 noodes
public class LinkedList {
    Node head;  //head of the list
    // linkedlist node : this inner class is made static so that main() can access it.
    static class Node{
        int data;
        Node next;
        Node(int d){

            data = d;
            next = null;
        } // Constructor of the node

    }
    // method to create a simple linkedlist with 3 nodes

    public static void main(String[] args) {
    // start with the emptuy list
       // LinkedList list = new LinkedList();
     LinkedList list = new LinkedList();
     list.head = new Node(1);
     Node second = new Node(2);
     Node third = new Node(3);
    // three node have been allocated dynamically .
        //we have refrences to these blocks as head
        list.head.next = second;  //link with the first node to second node
        second.next = third;

        // print node-value
        while (list.head != null){
            System.out.print(list.head.data + " ");
            list.head = list.head.next;

        }

    }
}


 */