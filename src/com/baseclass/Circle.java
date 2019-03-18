package com.baseclass;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius =" + radius + "color =" + color + "]";
    }

    public double getArea() {
        double square = Math.PI * Math.pow(radius, 2);
        return square;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass())
            return false;
        Circle right = (Circle) obj;
        return radius == right.radius && color.equals(right.color);
    }

    @Override
    public int hashCode() {
        int result = 17;
        long longValue = Double.doubleToLongBits(radius);
        result = 37 * result + (int)(longValue - (longValue >>> 32));
        result = 37 * result + (color == null ? 0 : color.hashCode());
        return result;
    }

}