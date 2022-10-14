package com.line.comparison;

public class LineComparison {
    public static void main(String[] args) {

        WelcomeMessage.msg();

        double length = LineCalculation.points(12,12,14,13);
        double length1 = LineCalculation.pointsNext(15,15,17,18);
        System.out.println("Length of Line L1: "+length);
        System.out.println("Length of Line L2 "+length1);
        LengthComparison.diff(length,length1);
    }
}