package com.company;

public class Main {

    public static void main(String[] args) {

        // I was born 14.10.1998. That`s why y = 0.4

        double start = 0;
        double finish = Math.PI;
        double deltaX = 0.1;
        double y = 0.4;

        double area = 0;

        for (double x = 0; x < finish; x += deltaX) {
            double rectangle = 0;
            if (Math.sin(x) < y) {
                rectangle = Math.sin(x) * deltaX;
            } else {
                rectangle = y * deltaX;
            }
            
            area += rectangle;
        }

        System.out.println(area);

    }
}