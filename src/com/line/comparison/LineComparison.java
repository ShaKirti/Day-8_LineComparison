package com.line.comparison;

public class LineComparison {
    public static void main(String[] args) {

        WelcomeMessage.msg();

        double length = LineCalculation.points(12,12,14,13);
        System.out.println(length);
    }
}