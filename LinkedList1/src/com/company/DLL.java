package com.company;

public class DLL {

    Node head;
    // insert the node in the linked list at first place
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev= null;
        if(head !=null){
            head.prev = node ;
        }
        head = node;
    }

    // insert the node at last in the linkedlist
    public void insertlast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    public Node find(int value){
        Node node = head;
        while (node!=null){
            if(node.val== value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    // insert the node at the particular index
    public void insert(int after,int val){
        Node p = find(after);
        if(p==null) {
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null) {
            node.next.prev = node;
        }
    }
    //delete only the first node of the doubly linked list
    public int deletefirst(){
        int value = head.val;
        head = head.next;
        head.prev = null;
        return value;
    }
    //delete the last node of the doubly linked list
    public int deleteend(){
        Node last = head;
        while (last.next!=null){
            last = last.next;
        }
        int value = last.val;
        last.prev.next = null;
        return value;
    }

    // display in  doubly linked list
    public void displayreverse(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("print in reverse");
        while(last!=null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("START");

    }
    /*
    // display the output in singly linked list
    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("END");
    }


     */
    // Node class
        private class Node{
            int val;
            Node next;
            Node prev;


            public Node(int val){
                this.val= val;
            }
            public Node(int val,Node next, Node prev){
                this.val = val;
                this.next= next;
                this.prev= prev;
            }
        }
}
