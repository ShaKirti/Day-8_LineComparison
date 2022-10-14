package com.line.comparison;

import java.util.Scanner;

class WelcomeMessage {
    static void msg(){
        System.out.println("Welcome to Line Comparison Computation Program.");
    }
}
class LineCalculation{
     static double points(int x1, int y1, int x2, int y2){
        double result = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        return result;
    }
}
