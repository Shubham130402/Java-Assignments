package com.company;
import java.io.*;
class vehicle1{
    int wheels;
    int headlights;
    String color;
    vehicle1(int wheels){
        this.wheels = wheels;
        headlights = 2;
    }
    vehicle1(int wheels, String color){
        this.wheels = wheels;
        this.color = color;
        headlights = 2;
    }
}
class Vehicles{
    int wheels;
    Vehicles(int noOfWheels) {
     //wheels=4;

        if(noOfWheels > 4 || noOfWheels == 3){
           wheels = 0;
        }
        else if(noOfWheels ==2){
            wheels = noOfWheels;
            System.out.println("Vehicle type is Bycycle/MotorCycle");
        }
        else if(noOfWheels == 4){
            wheels = noOfWheels;
            System.out.println("vehicle type is car/bus/truck..etc.");
        }
    }
}
public class Node {

     Node(){
         System.out.println("Constructor called");
    }
    public static void main(String[] args){
        vehicle1 car = new vehicle1(4);
        vehicle1 scooty = new vehicle1((2), "red");
        System.out.println(car.wheels + " Wheels in car");
        System.out.print( scooty.wheels + " " +" Wheels in scppty" + "\n" + scooty.color + " COlor");

    }
}
