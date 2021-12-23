package com.company;

public class LL {

    // write your code here

        private Node head;
        private Node tail;
        private int size;
        public LL() {
            this.size = 0;
        }

        // find out the index of the value from the givven linkedlist
    // if value is present in the linkedlist then just return the value otherwise return NULL

    public Node find(int value) {
        Node node = head;
        while(node!= null){
            if(node.val ==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    // delete the node at the particular index from 0 to end of the linkedlist
        public int delete(int index){
            if(index==0){
                return deletefirst();
            }
            if(index == size-1){
                return deleteend();
            }
           Node prev = get(index-1);
            int value = prev.next.val;
            prev.next = prev.next.next;
            return value;
        }
        //delete only the first node of the linkedlist
    public int deletefirst(){
          int value = head.val;
          head = head.next;
          return value;
    }
    //delete only the last node of the linkedlist
        public int deleteend(){
            if(size<=1){
                return deletefirst();
            }
            Node secondlast = get(size-2);
            int value = tail.val;
            tail = secondlast;
            tail.next= null;
            return value;
        }
        // return the node value of which we need to delete by get function
    public Node get(int index) {
            Node node = head;
             for(int i =0; i<index;i++){
                 node = node.next;
             }
             return node;
    }
    // insert the node in the given linkedlist at the particular index value
        public void insertatindex(int val,int index){
            if(index==0){
                insertatfirst(val);
                return;
            }
            if(index==size){
                insertlast(val);
                return;
            }
            Node temp = head;
            for(int i =1; i<index;i++) {
                temp = temp.next;
            }
            Node node = new Node(val,temp.next);
            temp.next = node;
            size++;

        }
        public void insertlast(int val){
            // create a new node at the end of the linkedlist
            Node node = new Node(val);
            tail.next = node;
        }
        public void insertatfirst(int val) {
            // create a new node for the value
            Node node = new Node(val);
            node.next = head;
            head = node;

            if (tail == null) {
                tail = head;
            }
            size += 1;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;

            }
            System.out.println("END");
        }
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}