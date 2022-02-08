package com.company;

import java.util.Scanner;

class Pen{
    String color;
    String model;
    public void write() {
        System.out.println("Writing something");
        }
        public void PrintColor(){
            System.out.println(this.color);
        }
}
public class OOPS {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Details");
        Pen pen1 = new Pen();
        pen1.color = scan.nextLine();
        pen1.model = scan.nextLine();
        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.model = "Gel";
        pen2.PrintColor();
        pen1.write();
        pen1.PrintColor();

    }
}
