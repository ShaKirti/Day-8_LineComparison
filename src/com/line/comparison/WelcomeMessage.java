package com.line.comparison;

import java.util.Scanner;
import java.util.Objects;
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
    static double pointsNext(int x3, int y3, int x4, int y4){
        double result1 = Math.sqrt(((x4-x3)*(x4-x3))+((y4-y3)*(y4-y3)));
        return result1;
    }
}
class LengthComparison{
    static void diff(double result, double result1) {
        if (Objects.equals(result, result1)) {
            System.out.println("Both lines are of same length.");
        } else
            System.out.println("Both lines are of different length.");
    }
}