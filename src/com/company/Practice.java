package com.company;
import java.util.*;
public class Practice {
    // Programs for the Singly Linked List from the Assignment No- 02
    //Que-4 WAP TO reverse the linkedlist created in (1)
     class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    //addNOde() will add a new node
    public void addNode(int data){
        Node newnode = new Node(data);

        //check if the list of the linked ist is empty or not
        if (head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            // newnode will be added after tail such that next will point to newNOde
            tail.next = newnode;
            tail = newnode;

        }
    }
    public void nonreversedisplay(){
        Node current = head;
        if(head == null){
            System.out.println("list is empty, we cannot see any element");
            return;
        }
        System.out.println(" Nodes of  Singly Linked List");
        while ( current!=null){
            System.out.println(current.data + " ");
            current = current.next;
        }

    }
    public void reverse(){
        Node current = head;
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        while (current !=null){

        }
    }
    public static void main(String[] args){
        Practice lilist = new Practice();
        lilist.addNode(3);
        lilist.addNode(4);
        lilist.addNode(5);
        lilist.addNode(6);
        lilist.addNode(7);

        lilist.nonreversedisplay();
    }
    /*
    //Q.2 WAP to insert a node in the linked list created in a)at the beginning b) at the end c) at anywhere b/w frist and last node given by the user
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public Node head = null;
        public Node tail = null;
        // this function is in Linkedlist (Practice)  class, insert a new node at front of the list.
        // This method is defined inside Linkedlist (Practice) class show above
        //insert at the front

        public void push(int new_data){
            // Allocate the Node & put in the data
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;

        }

        // insert at the eno in the linked list
    public void insertatEnd(int data){
        //create a new node
        Node newnode = new Node(data);
        //check if the list is empty or not
        if (tail != null) {
            tail.next = newnode;
            tail = newnode;
        } else {
            head = newnode;
            tail= newnode;
        }
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        System.out.println("Adding node to the list");
        while (current != null){
            //print each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Practice lilist = new Practice();
        lilist.push(23);
        lilist.push(83);
        lilist.push(63);
        lilist.push(13);
        lilist.insertatEnd(33);
        lilist.insertatEnd(36);
        lilist.insertatEnd(34);

        lilist.display();

    }

     */

    //Q.1 WAP to create a comman linked list of infinite node (no constraints)
    //Representing the node of a singly linkeclist
    /*static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }// constructor of the node
    }
    // Representing the head and tail of the Practice linked list
    public Node head =null;
    public Node tail = null;

    //addNOde() will add a new node
    public void addNode(int data){
        Node newnode = new Node(data);

        //check if the list of the linked ist is empty or not
        if (head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            // newnode will be added after tail such that next will point to newNOde
            tail.next = newnode;
            tail = newnode;

        }
    }
    //countNOde() will count the nodes present in the list
    public int countNode(){
        int count = 0;
        Node current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    // display() will display the list
    public void display(){
        Node current = head;
        if (head== null){
            System.out.println("list id empty");
            return;
        }
        System.out.println("Nodes of singly linked list");
        while(current != null){
            System.out.print(current.data + " ");
           current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
       Practice lilist = new Practice();

        lilist.addNode(34);
        lilist.addNode(41);
        lilist.addNode(42);
        lilist.addNode(43);
        lilist.addNode(44);
        lilist.addNode(45);
        lilist.addNode(46);
        lilist.addNode(47);
        lilist.addNode(48);


       lilist.display();
       System.out.println("count is : " + lilist.countNode());



    }

     */
}
