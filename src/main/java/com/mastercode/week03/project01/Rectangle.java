package com.mastercode.week03.project01;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;

        if (width < 0) width = 0;
        if (length < 0) length = 0;
    }


    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
}
